package ejercicio05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// Pedir un número y calcular su factorial. 
		// Por ejemplo, el factorial de 5 se denota 5! 
		// y es igual a 5x4x3x2x1 = 120.

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num; 
		long factorial = 1;  
		
		// Pedir al usuario que introduzca un número y usando el for calcularemos el factorial
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		for (int i = 1; i <= num; i ++) {
		factorial *= i; 
		}
		
		// Mostrar en pantalla el factorial introducido por el usuario
		System.out.println("El factorial es: " + factorial);
				
		// Cerrar scanner
		reader.close();

	}

}
