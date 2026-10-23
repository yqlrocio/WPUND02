package ejercicios;

import java.util.Scanner;

public class EJ16_Figura_dos_diagonales {

	public static void main(String[] args) {
	
		// DIBUJAR UNA FIGURA CON DOS DIAGONALES

		/*
		 * Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
		 */

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar la base
		Integer N;  
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce el valor de N: ");
		N = reader.nextInt();
		
		// Dibujar el rectángulo con los valores obtenido
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j==i || j == N - 1 - i) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
