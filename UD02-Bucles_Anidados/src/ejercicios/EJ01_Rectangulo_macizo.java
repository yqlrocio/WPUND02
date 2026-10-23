package ejercicios;

import java.util.Scanner;

public class EJ01_Rectangulo_macizo {

	public static void main(String[] args) {
		
		// DIBUJAR UN RECTÁNGULO MACIZO
		
		/*
		 * Pide filas y columnas. Dibuja un rectángulo de asteriscos.
		 */

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar fila y columna
		Integer fila; 
		Integer columna; 
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce las filas: ");
		fila = reader.nextInt();
		
		System.out.println("Introduce las columnas: ");
		columna = reader.nextInt(); 
		
		// Dibujar el rectángulo con los valores obtenido
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
