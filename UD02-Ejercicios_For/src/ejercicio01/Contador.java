package ejercicio01;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		// Escribir una aplicación para aprender a contar, 
		// que pedirá un número n y mostrará todos los 
		// números del 1 al n.

		Scanner reader = new Scanner(System.in);
		
		Integer num; 
		
		System.out.println("Introduce un número");
		num = reader.nextInt(); 
		
		for (int i = 1; i<=num; i++) {
			System.out.println(i);
		}
		
		reader.close();
		
	}

}
