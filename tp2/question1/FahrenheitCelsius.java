package question1;

import java.util.Scanner;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les param�tres de la ligne de commande
	      
              float celsius = 0;
		
              int[] tabFahrenheit= new int[args.length];
              
              for(int i=0; i<args.length; i++){
                  tabFahrenheit[i]= Integer.parseInt(args[i]);
              }
               
              for(int i=0; i<args.length; i++){
                  celsius=fahrenheitEnCelsius(tabFahrenheit[i]);
	          System.out.println(tabFahrenheit[i] + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
	       }																			// format
																				// impos�s
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	    
            float res = (float)(f - 32)*5/9;
            float celsius = ((int)(res*10))/10.0f;
		return celsius; // � compl�ter en rempla�ant ce return 0.F par la fonction
					// de conversion
	}

}
