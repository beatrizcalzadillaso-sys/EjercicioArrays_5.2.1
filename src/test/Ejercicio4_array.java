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
		calculoDatos(notas);
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
	
	private static void calculoDatos(int[] numbers) {
		// ENCONTRAR MAYOR NOTA
		int highest= numbers[numbers.length-1];
		for (int i=0; i<numbers.length-1; i++) {
			if (numbers[i]>highest) {
				highest=numbers[i];
				}
			}
		System.out.printf("\n La mayor nota es: %d%n%n",highest);
		
		// HAY MAS DE UNA PERSONA CON LA MAYOR NOTA?
/*		
  		int count= 0;
		for(int i=0; i<numbers.length;i++) {
			if (numbers[i]==highest) {
				count++;
				}
			}
		
		// IMPRIMIR NOMBRE DE LA PERSONA/S CON MAYOR NOTA	
		if (count>1) {
				String [] elite= new String[count];
			}
		else {String [] elite= new String[1];}      */
	
		
		String [] elite= new String[10];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]==highest) {
				elite[i]=nombres[i];
				} 
			}
		
		for (int i=0; i<elite.length;i++) {
			if (elite[i]!= null) {
				System.out.println(elite[i]+" tiene la mayor nota de la clase");}
			}
	}
}
