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
			System.out.printf("Nombre: %-28s || Programacion: %d || Redes: %d || Bases de Datos: %d%n", words[i], grade1[i], grade2[i], grade3[i]);
			
		}
	}

}
