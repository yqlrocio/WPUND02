package ejercicios;

import java.util.Scanner;

public class EJ09_Rombo {

	public static void main(String[] args) {
		
		// ROMBO
		
		/*
		 * Combina una pirámide de N niveles con una pirámide invertida sin repetir la fila central.
		 */

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable 
		Integer N;  
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce el valor de N: ");
		N = reader.nextInt();
		
		// Dibujar la pirámide con los valores obtenido
		
			// Pirámide hacia arriba
			for (int i = 0; i < N; i++) {
				for (int j= 0; j < 2*N-1; j++) {
					if (j >= N-i-1 && j <= N+i-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			
				System.out.println();
			}
			
			// Pirámide hacia abajo
			// Dibujar el rectángulo con los valores obtenido
			for (int i = N-2; i >= 0; i--) {
				for (int j = 0; j < 2*N-1; j++) {
					if (j >= N-i-1 && j <= N+i-1) {
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
