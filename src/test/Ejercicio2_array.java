/**
 * 
 */
package test;

//import java.util.Scanner;

/**
 * 
 */
public class Ejercicio2_array {

	//private static Scanner key = new Scanner(System.in);
	private static int numbers[] = new int[20];
	private static int suma = 0;
	private static int producto=1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargarTabla();
		sumaPares(numbers);
		prodImpares(numbers);
		imprimirDatos(numbers);

	}

	
	private static int generarNumero() {
		
			int randomNumber = (int) Math.floor(Math.random() * 100 + 1); // (Math.random() * (max - min + 1)) + min)
			return randomNumber;
		}

	private static int[] cargarTabla() {
		System.out.println("\n Presione una tecla para continuar...");
		//String start= key.nextLine();
		
		for (int i =0; i<20; i++) {
			numbers[i]=generarNumero();
		}
		return numbers;
	}
	
	private static int sumaPares(int [] lista) {
		for (int i=1; i<lista.length; i= i+2) {
			suma = suma + lista[i];
		}
		//System.out.println("La suma de los pares es "+suma);
		return suma;
	}
	
	private static int prodImpares(int [] lista) {
		for (int i=0; i<lista.length-1; i= i+2) {
			producto = producto * lista[i];
		}
		
		return producto;
	}
	
	private static void imprimirDatos(int[] lista) {
		
		for(int i=0; i<lista.length; i++) {
			System.out.println("--------------------");
			System.out.println(i+1+"- Numero: "+lista[i]);
		}
		
		System.out.println("\nLa suma de los pares es "+suma);
		System.out.println("\nEl producto de los impares es "+producto);
	}

}

