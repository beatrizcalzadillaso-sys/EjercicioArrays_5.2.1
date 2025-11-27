/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio4_array {

	private static String [] nombres= new String[10];
	private static int[] notas= new int[10];
	
	public static void main(String[] args) {
		iniciarNombres(nombres);
		iniciarNotas(notas);
		imprimir(nombres, notas);
	}

	private static void iniciarNombres(String[] words) {
		words[0]="Alejandro Torres Maldonado";
		words[1]="Marina López Cevallos";
		words[2]="Javier Serrano Álvarez";
		words[3]="Claudia Ramos Villalba";
		words[4]="Rubén Ortega Benítez";
		words[5]="Sofía Delgado Carranza";
		words[6]="Héctor Morales Quintana";
		words[7]="Natalia Cabrera Soriano";
		words[8]="Diego Esteban Riquelme";
		words[9]="Laura Paredes Montenegro";
			
	}
	private static void iniciarNotas(int[] numbers) {
		int contador=0;
		
		
		do {
			int randomGrade= (int) Math.floor(Math.random() * 11 + 1); // (Math.random() * (max - min + 1)) + min)
			if (randomGrade>=0 && randomGrade<=10) {
				numbers[contador]=randomGrade;
				contador++;
			}
			
		}while(contador!=10);
	}
	
	private static void imprimir(String[] words, int[] numbers) {
		System.out.println("Las notas de los estudiantes son: ");
		for (int i=0; i< words.length; i++) {
			int index= i+1;
			System.out.printf("Programacion: %-3d- %-28s || %d%n", index, words[i], numbers[i]);
			
		}
	} 
}
