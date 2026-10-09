package ejercicio01;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
	//	Diseñar una aplicación que solicite al usuario 
	//	un número e indique si es par o impar.

		Scanner reader = new Scanner(System.in);
		
		Integer num;
		
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		if (num%2==0) {
			System.out.println("¡EL NÚMERO ES PAR!");
		} else {
			System.out.println("¡EL NÚMERO ES IMPAR!");
		}
		
		reader.close();

		
	}

}
