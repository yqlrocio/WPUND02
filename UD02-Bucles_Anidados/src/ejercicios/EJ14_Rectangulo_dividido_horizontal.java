package ejercicios;

import java.util.Scanner;

public class EJ14_Rectangulo_dividido_horizontal {
				
	public static void main(String[] args) {

		// RECTÁNGULO DIVIDIDO EN DOS ZONAS HORIZONTALES

		/*
		 * 	La mitad superior se dibuja con * y la inferior con #. Usa un número par de filas.
		 */

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables para almacenar filas y columnas
		Integer filas;
		Integer columnas;
		
		// Pedir al usuario las filas y columnas para el rectángulo
		System.out.println("Introduce el número de filas (par): "); 
		filas = reader.nextInt();
		
		System.out.println("Introduce el número de columnas: ");
		columnas = reader.nextInt();
		
		// Crear condición de obligar que sea par la fila
		if (filas%2!=0) {
			System.out.println("ERROR: Introduce una fila (par)");
			filas = reader.nextInt();
		}
		
		// Calcular el punto medio de las filas 
		int mitad = filas / 2;
		
		// Dibujar el rectángulo con los valores obtenidos
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i < mitad) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}