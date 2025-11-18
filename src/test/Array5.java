package test;

import java.util.Scanner;

/**
 * 
 */
public class Array5 {

	private static Scanner teclado = new Scanner(System.in);
	private static int listaEdades[] = new int[20];
 	
	public static void main(String[] args) {
		leerEdad();
		calcularMedia(listaEdades);
		for(int i=0; i<listaEdades.length; i++) {
			System.out.println("--------------------");
			System.out.println(i+1+"- Edad: "+listaEdades[i]);
		}

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
		int mediaEntera=0;
		return mediaEntera;
	}
}
