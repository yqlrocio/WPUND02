package ejercicios;

import java.util.Scanner;

public class EJ05_Angulo_abajo_derecha {

	public static void main(String[] args) {
		
		// DIBUJAR UN TRIÁNGULO RECTÁNGULO: ÁNGULO ABAJO A LA DERECHA 

		/*
		 * Utiliza espacios iniciales para alinear los asteriscos a la derecha. 
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
				if (i>=N-1-j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
