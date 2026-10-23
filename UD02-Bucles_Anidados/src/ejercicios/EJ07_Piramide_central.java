package ejercicios;

import java.util.Scanner;

public class EJ07_Piramide_central {

	public static void main(String[] args) {
		
		// DIBUJAR UNA PIRAMIDE INVERTIDA

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable 
		Integer N;  
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce el valor de N: ");
		N = reader.nextInt();
		
		// Dibujar la pirámide con los valores obtenido
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
		
		// Cerrar scanner
		reader.close();
		
	}

}
