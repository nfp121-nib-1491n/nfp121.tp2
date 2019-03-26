package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
   
      Object obj= ae.getSource();
      int fahrenheit;
      float celsius;
      
      try{
          if(obj==boutonDeConversion){
            fahrenheit= Integer.parseInt(entree.getText());
            celsius= fahrenheitEnCelsius(fahrenheit);
	   
            if(celsius < -273.1) { celsius= -273.1f; }
            
            sortie.setText( Float.toString(celsius));
          }
        }catch(NumberFormatException nfe){
         sortie.setText("error ! ");
    }
  
}
  public static float fahrenheitEnCelsius(int f) {
	    
            float res = (float)(f - 32)*5/9;
            float celsius = ((int)(res*10))/10.0f;
	    return celsius;
	}
    
  public static void main(String[] args){
      new IHMFahrenheit();
    }
 }
