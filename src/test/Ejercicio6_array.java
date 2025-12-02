/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio6_array {

	private static int [] tabla1= new int [20];
	
	public static void main(String[] args) {
		
		cargarTabla(tabla1, 1, 20);
		invertirArray(tabla1);
		mostrarArray(tabla1);
	}
	
	private static void cargarTabla(int[] table, int valorMin, int valorMax) {
		for (int i= 0; i< table.length; i++){
			int aleatorio= (int) Math.floor(Math.random() * (valorMax-valorMin +1) + valorMin); // (Math.random() * (max - min + 1)) + min)
			table[i]=aleatorio;
			}
		System.out.println("---Tabla original---");
		for (int i=0; i<table.length;i++) {
			System.out.println(table[i]);
		}
	}
	
	private static void invertirArray(int[] table) {
		int change=0;
		int half= (int) table.length/2;
		
		for (int i=0; i<half-1; i++) {
			change = table[i];
			table[i]= table[table.length-1-i];
			table[table.length-1-i]= change;
			}
		
		
		
	}
	
	private static void mostrarArray(int[] table) {
		System.out.println("---Tabla invertida---");
		for (int i=0; i<table.length;i++) {
			System.out.println(table[i]);
		}
		
		//System.out.println(table.toString());
	}

}
