package ejercicios;

import java.util.Scanner;

public class EJ03_Angulo_abajo_izquierda {

	public static void main(String[] args) {
		
		// DIBUJAR UN TRIÁNGULO RECTÁNGULO: ÁNGULO ABAJO A LA IZQUIERDA 
		
		/*
		 * Pide la altura N y construye un triángulo creciente alineado a la izquierda. 
		 */

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar la base
		Integer N;  
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce la base de un triángulo: ");
		N = reader.nextInt();
		
		// Dibujar el rectángulo con los valores obtenido
		for (int i = 0; i < N; i++) {
			for (int j= 0; j <= i; j++) {
					System.out.print("*");
				}
			
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
