package ejercicio04;

import java.util.Scanner;

public class Suma_Impar_10_numeros {

	public static void main(String[] args) {
		
		// Diseñar un programa que muestre la suma de 
		// los 10 primeros números impares.

		// Crear scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Creamos variable para almacenar la suma de los números 
		Integer suma = 0; 
		
		// Crear for para que muestre la suma de los 10 primeros números impares
		for (int num = 1; num <= 19; num += 2) {
			suma += num;
		}
			
		// Mostrar en pantalla los múltiplos de 3
		System.out.println("La suma es: " + suma);

		// Cerramos Scanner
		reader.close(); 
	}

}
