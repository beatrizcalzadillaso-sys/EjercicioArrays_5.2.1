package test;

import java.util.Scanner;

/**
 * 
 */
public class Array5 {

	private static Scanner teclado = new Scanner(System.in);
	private static int listaEdades[] = new int[20];
	private static int mediaEntera=0;
 	
	public static void main(String[] args) {
		leerEdad();
		calcularMedia(listaEdades);
		imprimirEdades(listaEdades);
				
	}
	
	private static int[] leerEdad() {
		
		int valorEdad=0;
		int cantidad= 0;
		
		
		do{
			boolean correcto= false;
			while(!correcto){
				System.out.println("\nIntroduzca un numero entre 18 y 35: ");
				String edad= teclado.nextLine();
				
				try {
					valorEdad = Integer.parseInt(edad);
					
					if (valorEdad<18 || valorEdad>35) {
						System.out.println("\nERROR: Debe introducir una edad entre 18 y 35");
					} else {
						correcto=true;
						listaEdades[cantidad]=valorEdad;
						cantidad++;
						System.out.println("\n ++++++++++++CORRECTO++++++++++"
								+ "\nSe ha guardado el valor de edad: "+valorEdad+" y ha guardado "+cantidad+" edades");
						
					}
				} catch (NumberFormatException e){
					System.out.println("\nERROR: Debe introducir un numero");
				}
			}
		} while(cantidad<20);
		return listaEdades;
	}
	
	private static int calcularMedia(int[] lista) {
	
		int suma=0;
		
		for (int i=0; i<lista.length; i++) {
			suma = suma + lista[i];
		}
		
		float media=suma/(lista.length);
		mediaEntera = Math.round(media);
		
		// FALTA QUE IMPRIMA SOLO EL FLOAT MEDIA CON DOS CIFRAS DECIMALES, REVISAR Y AJUSTAR
		//System.out.printf("\nLa media de edades es %.2f y se ha redondeado a %d", media, mediaEntera);
		return mediaEntera;
	}
	
	
	private static void imprimirEdades(int[] lista) {
	
		for(int i=0; i<lista.length; i++) {
			System.out.println("--------------------");
			System.out.println(i+1+"- Edad: "+lista[i]);
		}
		
		System.out.println("\nEl promedio de edades es "+mediaEntera);
	}
	
}
