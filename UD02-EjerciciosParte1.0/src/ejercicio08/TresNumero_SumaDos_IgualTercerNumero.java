package ejercicio08;

import java.util.Scanner;

public class TresNumero_SumaDos_IgualTercerNumero {

	public static void main(String[] args) {
		
		// Escribir un programa que pida al usuario 
		// tres números enteros, y que muestre por pantalla 
		// si la suma de dos de esos números da como resultado 
		// el otro número.
		
		// Crear scanner
		Scanner reader = new Scanner(System.in);

		// Crear variable para almacenar 3 números
		Integer num1; 
		Integer num2; 
		Integer num3; 

		// Pedir al usuario introducir 3 números
		System.out.println("Introduce número 1: ");
		num1 = reader.nextInt();
		System.out.println("Introduce número 2: ");
		num2 = reader.nextInt();
		System.out.println("Introduce número 3: ");
		num3 = reader.nextInt();

		// Comprobar si la suma de dos de los valores es igual que el otro
		if (num1 + num2 == num3) {
			System.out.println("Tras sumar num1 + num2");
		}

		// Cerrar scanner
		reader.close();

	}

}
