package ejercicios;

import java.util.Scanner;

public class EJ06_Arbol_mas_alto {

	public static void main(String[] args) {
		
		// Un centro de investigación de la flora urbana necesita 
		// una aplicación que muestre cuál es el árbol más alto. 
		// Para ello se introducirá por teclado la altura (en 
		// centímetros) de cada árbol (terminando la introducción 
		// de datos cuando se utilice -1 como altura). La 
		// aplicación debe devolver la altura del árbol más alto.
		
		// 1,20 -> alturaMaxima
		// 3,8 -> alturaMaxima
		// 0,5
		// -1
		
		//Create scanner
		Scanner sc=new Scanner(System.in);
		
		//Create variables for the high of the trees and the maximum high
		int altura;
		int alturaMax=0;
		
		//Ask the user for the first high
		System.out.println("Introduce la altura del primer árbol");
		//And read it
		altura=sc.nextInt();
		
		
		//Now create a condition to compare each high the user introduces.
		while (altura>0) {
			if (altura>alturaMax) {alturaMax=altura;}
			
		System.out.println("Introduce la altura del siguiente árbol");
			altura = sc.nextInt();
		}
		
		//Print the results in case of a negative high
		System.out.println("El árbol más alto mide " + alturaMax);
		
	sc.close();
	

}
}