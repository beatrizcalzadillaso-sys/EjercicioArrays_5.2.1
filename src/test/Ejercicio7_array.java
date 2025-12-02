/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio7_array {

	private static int[] table2= new int[20];
	private static int[] tableFix= new int[20];
			
	public static void main(String[] args) {
		cargarTabla(20, 0, 10);
		moverCerosFinal(table2);

	}
	
	private static int[] cargarTabla(int n, int valorMin, int valorMax) {
		for (int i= 0; i< n+1; i++){
			int aleatorio= (int) Math.floor(Math.random() * (valorMax-valorMin +1) + valorMin); // (Math.random() * (max - min + 1)) + min)
			table2[i]=aleatorio;
			}
		return table2;
	}
	
	private static void moverCerosFinal (int [] table) {
		int iFix=0;
		
		for (int i=0; i<table.length; i++) {
			if(table[i]!=0) {
				tableFix[iFix]=table[i];
				iFix++;
			}
		}
	}

}

