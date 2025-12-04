/**
 * 
 */
package test;

/**
 * 
 */
public class Ejercicio4_array {

	private static String [] estudiantes= new String[10];
	private static int[] notas= new int[10];
	
	public static void main(String[] args) {
		iniciarNombres(estudiantes);
		iniciarNotas(notas);
		imprimir(estudiantes, notas);
		System.out.println("-------------------------------------");
		calculoDatos(notas, estudiantes);
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
	
	private static void calculoDatos(int[] numbers, String [] names) {
		// MEDIA DE LAS NOTAS
		int sum= 0;
		for (int i=0; i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		float average =  (float)sum/numbers.length;
		
		System.out.printf("La media de las notas en la clase fue %.1f%n", average);
		System.out.println("-------------------------------------");
		
		// ALUMNOS CON NOTA MAYOR QUE LA MEDIA
		int [] bestGrades= new int[10];
		String [] bestNames= new String[10];
		int indexBest=0;
		
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i]>=average) {
				bestGrades[indexBest]=numbers[i];
				bestNames[indexBest]=names[i];
				indexBest++;
			}
		}
		System.out.println("Los estudiantes con notas mayor que la media son: \n");
		for(int i=0; i<bestGrades.length; i++) {
			if(bestGrades[i]!=0) {
				System.out.printf("%-28s : %d%n", bestNames[i], bestGrades[i]);
			}
		}
		
		System.out.println("-------------------------------------");
		// ENCONTRAR MAYOR NOTA
		int highest= numbers[numbers.length-1];
		for (int i=0; i<numbers.length-1; i++) {
			if (numbers[i]>highest) {
				highest=numbers[i];
				}
			}
		System.out.printf("\n La mayor nota es: %d%n%n",highest);
		
			// HAY MAS DE UNA PERSONA CON LA MAYOR NOTA?
		
		String [] elite= new String[10];
		int indexElite=0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]==highest) {
				elite[indexElite]=names[i];
				indexElite++;
				} 
			}
			// IMPRIME LA LISTA DE PERSONAS QUE TIENEN LA MAYOR NOTA
		for (int i=0; i<elite.length;i++) {
			if (elite[i]!= null) {
				System.out.printf("%-28s tiene la mayor nota de la clase\n\n", elite[i]);}
			}
		
			// IMPRIME LA ULTIMA PERSONA CON LA MAYOR NOTA
		System.out.println(elite[indexElite-1]+" es la ultima persona consultada con la mayor nota");
		
		// ENCONTRAR MENOR NOTA
		int lowest= numbers[0];
		for (int i=0; i<numbers.length-1; i++) {
			if (numbers[i]<lowest) {
				lowest=numbers[i];
				}
			}
		System.out.printf("\n La menor nota es: %d%n%n",lowest);
		
			// IMPRIMIR LA MENOR NOTA
		String [] bottom= new String[10];
		int indexBottom=0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]==lowest) {
				bottom[indexBottom]=names[i];
				indexBottom++;
				} 
			}
			// IMPRIME LA LISTA DE PERSONAS QUE TIENEN LA MAYOR NOTA
		for (int i=0; i<bottom.length;i++) {
			if (bottom[i]!= null) {
				System.out.printf("%-28s tiene la menor nota de la clase\n\n", bottom[i]);}
		}
		// IMPRIME LA ULTIMA PERSONA CON LA menor NOTA
		System.out.println(bottom[indexBottom-1]+" es la ultima persona consultada con la menor nota");
	}
	
}
