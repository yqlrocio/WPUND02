package ejercicios;

import java.util.Scanner;

public class EJ08_Piramide_invertida {

	public static void main(String[] args) {
	// DIBUJAR UNA PIRAMIDE INVERTIDA

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable 
		Integer N;  
		
		// Pedir al usuario las filas y columnas para un rectángulo
		System.out.println("Introduce el valor de N: ");
		N = reader.nextInt();
		
		// Dibujar el rectángulo con los valores obtenido
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2*N-1; j++) {
				if (j>=i && j<2*N-1-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
//		OTRA FORMA DE HACERLO
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < 2*N-1; j++) {
//				if (j < i || j >= 2*N-1-i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println();
//		}
			
		// Cerrar scanner
		reader.close();
		
	}

}
