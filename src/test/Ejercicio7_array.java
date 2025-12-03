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
		for (int i= 0; i< n; i++){
			int aleatorio= (int) Math.floor(Math.random() * (valorMax-valorMin +1) + valorMin); // (Math.random() * (max - min + 1)) + min)
			table2[i]=aleatorio;
			}
		return table2;
	}
	
	private static void moverCerosFinal (int [] table) {
		int iFix=0;
		
		// LLEVAR LOS ELEMENTOS DISTINTOS DE CERO A OTRA TABLA
		for (int i=0; i<table.length; i++) {
			if(table[i]!=0) {
				tableFix[iFix]=table[i];
				iFix++;
			}
		}
		System.out.println("---Tabla aleatoria---");
		for (int i=0; i<table.length;i++) {
			System.out.printf("%d  ",table[i]);
			}
		System.out.println("\n");
		
		System.out.println("---Tabla con ceros separados---");
		for (int i=0; i<tableFix.length;i++) {
			System.out.printf("%d  ",tableFix[i]);
		}
		
	}

}

