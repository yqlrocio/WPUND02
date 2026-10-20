package ejercicios;

import java.util.Scanner;

public class EJ04_Angulo_arriba_izquierda {

	public static void main(String[] args) {
		
		// DIBUJAR UN TRIÁNGULO RECTÁNGULO: ÁNGULO ARRIBA A LA IZQUIERDA 

		/*
		 * La primera fila tiene N asteriscos y cada fila siguiente uno menos.
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
			for (int j= 0; j < N; j++) {
				if (j>=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
