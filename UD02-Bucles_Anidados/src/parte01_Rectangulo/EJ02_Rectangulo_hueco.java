package parte01_Rectangulo;

import java.util.Scanner;

public class EJ02_Rectangulo_hueco {

	public static void main(String[] args) {
		
		// DIBUJAR UN RECTÁNGULO HUECO 
		
		/*
		 * Dibuja solo el contorno. Las posiciones interiores son espacios. 
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
				if (i==0 || i==fila-1 || j==0 || j==columna-1) {
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
