/**
 * 
 */
package test;

import java.util.Random;

/**
 * 
 */
public class Ejercicio5_array {

	private static char[] lotery= new char[100];
	private static int[] lotFrecuency= new int[26];
	
	public static void main(String[] args) {
		generarSorteo(100,1,100);
		mostrarSorteo(lotery);
		contarFrecuencias(lotery, 1, 100);
		mostrarFrecuencias(lotFrecuency, 1, 100);
		

	}

	private static void generarSorteo(int numTiradas, int valorMin, int valorMax) {
		// Source - https://stackoverflow.com/a
		// Posted by dogbane
		// Retrieved 2025-11-27, License - CC BY-SA 2.5

		for (int i=0; i<numTiradas; i++) {
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'a');
			lotery[i]=c;
			}
	}
	
	private static void mostrarSorteo(char[] arraySorteo) {
		for (int i=0; i<arraySorteo.length; i++) {
			if (i==15 ||i==30 ||i==45 ||i==60 ||i==75 ||i==90){
				System.out.println("\n");
			}			
			System.out.printf(" %c ",arraySorteo[i]);
		}
	}
	
	private static void contarFrecuencias(char[] arraySorteo, int valorMin, int valorMax) {
		
	}
	
	private static void mostrarFrecuencias(int[] arrayFrecuencias, int valorMin, int valorMax) {
		
	}
	
}
