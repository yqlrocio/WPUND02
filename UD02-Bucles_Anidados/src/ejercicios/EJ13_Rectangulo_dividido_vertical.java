package ejercicios;

import java.util.Scanner;

public class EJ13_Rectangulo_dividido_vertical {

	public static void main(String[] args) {
		
		// RECTÁNGULO DIVIDIDO EN DOS ZONAS VERTICALES

		/*
		 * En la mitad izquierda imprime * y en la derecha #. Para este ejercicio usa un número par de columnas.
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
		
		// Crear condición de obligar que sea par las columnas
		if (columnas%2!=0) {
			System.out.println("ERROR: Introduce una columna (par)");
			columnas = reader.nextInt();
		}
		
		// Calcular el punto medio de las columnas 
		int mitad = columnas / 2;
		
		// Dibujar el rectángulo con los valores obtenidos
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (j < mitad) {
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