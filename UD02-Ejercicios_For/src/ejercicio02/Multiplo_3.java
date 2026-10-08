package ejercicio02;

import java.util.Scanner;

public class Multiplo_3 {

	public static void main(String[] args) {
		
		// Realiza un programa que cuente los múltiplos de 
		// 3 desde el 1 hasta un número que introducimos por 
		// teclado.
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Variable para contar los múltiplos de 3
		int contMult = 0 ; 
		
		// Variable que almacene el número introducido por el usuario
		int numero; 
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		numero = reader.nextInt();
		
		for (int contador = 1; contador <= numero; contador++) {
			if(contador%3 == 0) {
				contMult++; 
			}
		}
		// Mostrar en pantalla los múltiplos de 3
		System.out.println("Hay " + contMult + " múltiplos de 3");

		// Cerramos Scanner
		reader.close(); 

	}

}
