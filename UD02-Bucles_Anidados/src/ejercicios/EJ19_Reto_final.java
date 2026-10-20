package ejercicios;

import java.util.Scanner;

public class EJ19_Reto_final {

	public static void main(String[] args) {
		// Elige dos figuras y haz que el usuario pueda repetir su 
		// ejecución mediante un menú hasta seleccionar «Salir». 
		// Comprueba que las dimensiones introducidas sean 
		// positivas.
		
		// Crear scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables para almacenar los datos
		Integer fila; 
		Integer columna;
		Integer opcion; 
		
		// Mostrar menú y elegir uno
		do {
			System.out.println("----------MENÚ-----------");
			System.out.println("| 1. Rectángulo macizo  |");
			System.out.println("| 2. Rectangulo hueco   |");
			System.out.println("| 3. Salir              |");
			System.out.println("-------------------------");
			opcion = reader.nextInt(); 

			switch (opcion) {
			case 1 -> {			 
				// Pedir al usuario las filas y columnas para un rectángulo
				System.out.println("Introduce las filas: ");
				fila = reader.nextInt();
				
				System.out.println("Introduce las columnas: ");
				columna = reader.nextInt(); 
				
				// Dibujar el rectángulo con los valores obtenido
				for (int i = 0; i < fila; i++) {
					for (int j = 0; j < columna; j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
			}
			
			case 2 -> {
				// Pedir al usuario las filas y columnas para un rectángulo
				System.out.println("Introduce las filas: ");
				fila = reader.nextInt();
				
				System.out.println("Introduce las columnas: ");
				columna = reader.nextInt(); 
				
				// Dibujar el rectángulo con los valores obtenido
				for (int i = 0; i < fila; i++) {
					for (int j = 0; j < columna; j++) {
						if (i==0 || i==fila-1 || j==0 || j==columna-1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			
			case 3 -> {
				System.out.println("Saliendo...");
			}
			
			default -> 
				System.out.println("ELEGIR UN VALOR ENTRE 1-3");
		}
			
		} while (opcion != 3);
		
		// Cerrar scanner 
		reader.close();

	}

}
