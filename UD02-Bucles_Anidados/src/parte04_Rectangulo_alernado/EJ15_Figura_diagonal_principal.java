package parte04_Rectangulo_alernado;

import java.util.Scanner;

public class EJ15_Figura_diagonal_principal {

	public static void main(String[] args) {
		
		// FIGURA DIAGONAL PRINCIPAL

		/*
		 * Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
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
			for (int j= 0; j < N; j++) {
				if (i==j) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
