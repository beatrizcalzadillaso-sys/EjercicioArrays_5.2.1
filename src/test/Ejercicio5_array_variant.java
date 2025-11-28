/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio5_array_variant {

	//private static char[] lotery= new char[100];
	private static char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	private static int [] numbers= new int[100];
	private static int[] lotFrecuency= new int[26];
	
	public static void main(String[] args) {
		generarSorteo(100,0,25);
		mostrarSorteo(numbers);
		contarFrecuencias(numbers, 1, 100);
		mostrarFrecuencias(lotFrecuency, 1, 100);
		

	}


	private static void generarSorteo(int numTiradas, int valorMin, int valorMax) {
		int count=0;
		int randomNum=0;
		do {
			for (int i=0; i<numTiradas;i++) {
				randomNum= (int) Math.floor(Math.random() * (valorMax-valorMin +1) + valorMin); // (Math.random() * (max - min + 1)) + min)
				numbers[i]= randomNum;
				count++;
				}
		}while(count!=numTiradas);
	}
	
	private static void mostrarSorteo(int[] arraySorteo) {
		for (int i=0; i<arraySorteo.length; i++) {
			if (i==15 ||i==30 ||i==45 ||i==60 ||i==75 ||i==90){
				System.out.println("\n");
			}			
			System.out.printf("%4d",arraySorteo[i]);
		}
		System.out.println("\n");
	}
	
	private static void contarFrecuencias(int[] arraySorteo, int valorMin, int valorMax) {
		for (int i=0; i<arraySorteo.length;i++) {
			lotFrecuency[arraySorteo[i]]+=1;
		}
	}
	
	private static void mostrarFrecuencias(int[] arrayFrecuencias, int valorMin, int valorMax) {
		for (int i=0; i<arrayFrecuencias.length;i++) {
			System.out.printf("La letra %c se repite %d%n", alphabet[i], arrayFrecuencias[i]);
		}
	} 
}
