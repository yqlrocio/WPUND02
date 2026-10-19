package ejercicios;

import java.util.Scanner;

public class EJ02_Contar_num_positivo {

	public static void main(String[] args) {
	
		// Escribe un programa que vaya pidiendo al usuario 
		// números enteros positivos que debe ir contando. 
		// Cuando el usuario no quiera insertar más números, 
		// introducirá un número negativo y el algoritmo, antes 
		// de acabar, mostrará la cantidad de números positivos 
		// introducidos por el usuario.

		// Crear scanner
		Scanner reader = new Scanner (System.in);
		
		// Crear variable para almacenar los números y la suma
		Integer num; 
		Integer contador = 0; 
		
		// Pedir al usuario introducir un número
		System.out.println("Introduce un número: ");
		num = reader.nextInt();
		
		// Mediante un while pedir introducir números hasta que salga un número negativo y contar los número introducidos 
		while (num >= 0) {
			++contador; 
			System.out.println("Introduce otro número: ");
			num = reader.nextInt();
		}
		
		System.out.println("La cantidad de números introducidos es: " + contador);
		
		// Cerrar scanner 
		reader.close();
		
	}

}
