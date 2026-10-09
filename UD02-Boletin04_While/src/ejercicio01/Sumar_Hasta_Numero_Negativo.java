package ejercicio01;

import java.util.Scanner;

public class Sumar_Hasta_Numero_Negativo {

	public static void main(String[] args) {
		
	// Escribe un programa que vaya pidiendo al usuario 
	// números enteros positivos que debe ir sumando. 
	// Cuando el usuario no quiera insertar más números, 
	// introducirá un número negativo y el algoritmo, antes
	// de acabar, mostrará la suma de los números positivos 
	// introducidos por el usuario.
	// 2
	// 3
	// 6
	// -1
	// La suma es 11

		// Crear scanner
		Scanner reader = new Scanner (System.in);
		
		Integer num; 
		Integer suma = 0; 
		
		System.out.println("Introduce un número: ");
		num = reader.nextInt();
		
		while (num > 0) {
			suma += num; 
			System.out.println("Introduce otro número: ");
			num = reader.nextInt();
		}
		
		System.out.println("La suma de los números es: " + suma);
		

		// Cerrar scanner 
		reader.close();
		
	}

}
