package parte04_Rectangulo_alernado;

import java.util.Scanner;

public class EJ18_Reloj_arena {

	public static void main(String[] args) {
		
	// Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.

	// Crear scanner
	Scanner reader = new Scanner(System.in); 
	
	// Crear variable para almacenar la base
	Integer N;  
	
	// Pedir al usuario las filas y columnas para un rectángulo
	System.out.println("Introduce el valor de N: ");
	N = reader.nextInt();
	
	for (int i = 0; i < 2*N-1; i++) {
		for (int j = 0; j < 2*N-1; j++) {
			if (i<=j && i<=(2*N-1)/2) {
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
