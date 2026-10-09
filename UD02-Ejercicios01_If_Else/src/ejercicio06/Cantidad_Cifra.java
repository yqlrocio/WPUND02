package ejercicio06;

import java.util.Scanner;

public class Cantidad_Cifra {

	public static void main(String[] args) {
		
		// Escribir una aplicación que indique cuántas 
		// cifras tiene un número introducido por teclado, 
		// que está comprendido entre 0 y 99999. 

		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar num
		Integer num; 
		
		// Pedir al usuario por un número
		System.out.println("Introduce un número comprendido entre 0-99999: ");
		num = reader.nextInt();
	
		// Mostrar por pantalla cuántas cifras tiene 
		if (num < 10) {
			System.out.println("El número tiene 1 cifra.");
		} else if (num < 100) {
			System.out.println("El número tiene 2 cifras.");
		} else if (num < 1000) {
			System.out.println("El número tiene 3 cifras.");
		} else if (num < 10000) {
			System.out.println("El número tiene 4 cifras.");
		} else {
			System.out.println("El número tiene 5 cifras.");
		}
		
		// Cerrar scanner 
		reader.close();

	}

}
