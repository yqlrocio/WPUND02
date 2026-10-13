package parte02_Triangulo;

import java.util.Scanner;

public class EJ07_Piramide_central {

	public static void main(String[] args) {
		
		// DIBUJAR UN TRIÁNGULO RECTÁNGULO: ÁNGULO ARRIBA A LA DERECHA 

		/*
		 * La cantidad de asteriscos disminuye mientras aumentan los espacios iniciales.
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
				if (j>=i) {
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
