package question1;

import java.util.Scanner;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les paramètres de la ligne de commande
	      
              float celsius = 0;
		
              int[] tabFahrenheit= new int[args.length];
              
              for(int i=0; i<args.length; i++){
                  tabFahrenheit[i]= Integer.parseInt(args[i]);
              }
               
              for(int i=0; i<args.length; i++){
                  celsius=fahrenheitEnCelsius(tabFahrenheit[i]);
	          System.out.println(tabFahrenheit[i] + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
	       }																			// format
																				// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	    
            float res = (float)(f - 32)*5/9;
            float celsius = ((int)(res*10))/10.0f;
		return celsius; // à compléter en remplaçant ce return 0.F par la fonction
					// de conversion
	}

}
