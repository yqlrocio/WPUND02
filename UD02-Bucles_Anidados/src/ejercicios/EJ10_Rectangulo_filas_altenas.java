package ejercicios;

import java.util.Scanner;

public class EJ10_Rectangulo_filas_altenas {

	public static void main(String[] args) {
		
		// RECTÁNGULO CON FILAS ALTERNAS

		/*
		 * Las filas impares muestran * y las pares #.
		 */
	
		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables para almacenar filas y columnas
		Integer filas;
		Integer columnas;
		
		// Pedir al usuario las filas y columnas para el rectángulo
		System.out.println("Introduce el número de filas: "); 
		filas = reader.nextInt();
		
		System.out.println("Introduce el número de columnas: ");
		columnas = reader.nextInt();
		
		// Dibujar el rectángulo con los valores obtenidos
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i%2==0) {
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
