package ejercicio08;

import java.util.Scanner;

public class Numero_entre_A_B {

	public static void main(String[] args) {
		
		// Realiza un programa que pida dos números enteros 
		// A y B. Luego visualiza los números que hay entre 
		// A y B. Si A es menor que B, entonces debe mostrar 
		// los números desde A hasta B. Si B es menor que A, 
		// entonces debe mostrar los números desde B hasta A.

		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar dos números
		Integer numA; 
		Integer numB; 
		Integer menor; 
		Integer mayor; 
		
		// Pedir al usuario por dos números
		System.out.println("Introduce un número: ");
		numA = reader.nextInt(); 
		System.out.println("Introduce otro número: ");
		numB = reader.nextInt();
		
		if (numA < numB) {
			menor = numA; 
			mayor = numB; 
		} else {
			menor = numB; 
			mayor = numA; 
		}
		
		// Vamos desde el número más pequeño al número más grande
		for(int cont = menor; cont<=mayor; cont ++)
		System.out.println(cont);
		
		// Cerrar scanner
		reader.close();
		
	}

}
