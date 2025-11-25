/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio3_array {

	private static int [] tabla= new int[20];
	
	public static void main(String[] args) {
		cargarTabla(tabla);
		mostrarArray(tabla);
		mostrarFrecuencias(tabla);

	}
	
	private static void cargarTabla(int[] matrix) {
		for (int i= 0; i< matrix.length; i++){
			int aleatorio= (int)Math.floor(Math.random()*9 + 1); // (Math.random() * (max - min + 1)) + min)
			matrix[i]=aleatorio;
		}
	}
	
	private static void mostrarFrecuencias(int[] matrix) {
		int cont1=0;
		int cont2=0;
		int cont3=0;
		int cont4=0;
		int cont5=0;
		int cont6=0;
		int cont7=0;
		int cont8=0;
		int cont9=0;
		
		for(int i=0; i<matrix.length; i++) {
			if (matrix[i]==1) {
				cont1++;
			}
			else if (matrix[i]==2){
				cont2++;
			
			}
			else if (matrix[i]==3){
				cont3++;
			}
			else if (matrix[i]==4){
				cont4++;
			}
			else if (matrix[i]==5){
				cont5++;
			}
			else if (matrix[i]==6){
				cont6++;
			}
			else if (matrix[i]==7){
				cont7++;
			}
			else if (matrix[i]==8){
				cont8++;
			}
			else if (matrix[i]==9){
				cont9++;
			}
		}
		
		System.out.printf("\nLa cantidad de 1 es %d", cont1);
		System.out.printf("\nLa cantidad de 2 es %d", cont2);
		System.out.printf("\nLa cantidad de 3 es %d", cont3);
		System.out.printf("\nLa cantidad de 4 es %d", cont4);
		System.out.printf("\nLa cantidad de 5 es %d", cont5);
		System.out.printf("\nLa cantidad de 6 es %d", cont6);
		System.out.printf("\nLa cantidad de 7 es %d", cont7);
		System.out.printf("\nLa cantidad de 8 es %d", cont8);
		System.out.printf("\nLa cantidad de 9 es %d", cont9);
	}
	
	private static void mostrarArray(int[] matrix) {
		for (int i=0; i<matrix.length; i++) {
			System.out.println(i+1+"---"+matrix[i]+"---");
		}
	}

}
