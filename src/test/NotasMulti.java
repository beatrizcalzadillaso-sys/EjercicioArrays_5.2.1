/**
 * 
 */
package test;

/**
 * 
 */
public class NotasMulti {

	private static String [] estudiantes= new String[5];
	private static int [] nProg= new int[5];
	private static int [] nRedes= new int[5];
	private static int [] nBd= new int[5];
	
	
	public static void main(String[] args) {
		iniciarNombres(estudiantes);
		iniciarNotas(nProg);
		iniciarNotas(nRedes);
		iniciarNotas(nBd);
		imprimir(estudiantes, nProg, nRedes, nBd);
		// POR ESTUDIANTE
		aveStudent(estudiantes, nProg, nRedes, nBd);
		// POR ASIGNATURA
		average("Programacion", nProg);
		average("Redes", nRedes);
		average("Bases de datos", nBd);
		System.out.println("-------------------------------------");
		highest("Programacion", nProg, estudiantes);
		highest("Redes", nRedes, estudiantes);
		highest("Bases de datos", nBd, estudiantes);
		System.out.println("-------------------------------------");
		lowest("Programacion", nProg, estudiantes);
		lowest("Redes", nRedes, estudiantes);
		lowest("Bases de datos", nBd, estudiantes);
		System.out.println("-------------------------------------");
		failed("Programacion", nProg);
		failed("Redes", nRedes);
		failed("Bases de datos", nBd);
		System.out.println("-------------------------------------");
		
	}
	
	private static void iniciarNombres(String[] words) {
		words[0]="Alejandro Torres Maldonado";
		words[1]="Marina López Cevallos";
		words[2]="Javier Serrano Álvarez";
		words[3]="Claudia Ramos Villalba";
		words[4]="Rubén Ortega Benítez";
	}
	
	private static void iniciarNotas(int[] numbers) {
		int contador=0;
		
		
		do {
			int randomGrade= (int) Math.floor(Math.random() * 11 + 1); // (Math.random() * (max - min + 1)) + min)
			if (randomGrade>=0 && randomGrade<=10) {
				numbers[contador]=randomGrade;
				contador++;
			}
			
		}while(contador!=5);
	}
	
	private static void imprimir(String[] words,  int[] grade1, int[] grade2, int[] grade3) {
		System.out.println("Las notas de los estudiantes son: ");
		for (int i=0; i< words.length; i++) {
			System.out.printf("Nombre: %-28s || Programacion: %d    || Redes: %d    || Bases de Datos: %d%n", words[i], grade1[i], grade2[i], grade3[i]);
			
		}
		System.out.println("-------------------------------------");
	}
	
	private static void aveStudent(String[] words,  int[] grade1, int[] grade2, int[] grade3) {
		
		int sum=0;
		float ave=0;
		
		for (int i=0; i<grade1.length; i++) {
			sum = grade1[i] + grade2[i]+ grade3[i];
			ave = sum/3;
			System.out.printf("El estudiante %-28s tuvo como nota media entre las tres asignaturas %.2f%n", words[i], ave);
		}
	}
	
	private static void average(String asignatura, int[] grade) {
		int suma =0;
		for (int i=0; i<grade.length;i++) {
			suma = suma + grade[i];
		}
		float media =  suma/grade.length;
		
		System.out.printf("La asignatura %-15s tuvo como media %.1f%n", asignatura, media);
		
	}
	
	private static void highest(String asignatura, int[] grade, String[] words) {
			
		int highest= grade[grade.length-1];
		int best =0;
		for (int i=0; i<grade.length-1; i++) {
			if (grade[i]>highest) {
				highest=grade[i];
				best=i;
				}
			}
		System.out.printf("La asignatura %-15s tuvo como maximo %d , y fue el estudiante %-28s%n", asignatura, highest, words[best]);
	}
	
	private static void lowest(String asignatura, int[] grade, String[] words) {
		
		int lowest= grade[grade.length-1];
		int worst =0;
		for (int i=0; i<grade.length; i++) {
			if (grade[i]<lowest) {
				lowest=grade[i];
				worst=i;
				}
			}
		System.out.printf("La asignatura %-15s tuvo como minimo %d, y fue el estudiante %-28s%n", asignatura, lowest, words[worst]);
	}
	
	private static void failed(String asignatura, int[] grade) {
		int amount=0;
		for (int i=0; i<grade.length;i++) {
			if (grade[i]<6) {
				amount++;
			}
		}
		System.out.printf("En la asignatura %-15s hubo %d suspensos con notas menores de 6\n", asignatura, amount);
	}
	

}
