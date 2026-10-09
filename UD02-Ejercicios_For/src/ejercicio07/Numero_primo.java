package ejercicio07;

import java.util.Scanner;

public class Numero_primo {

	public static void main(String[] args) {
		
		// Realiza un programa en java que pida un número 
		// entero positivo y nos diga si es primo o no.

		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int numUsuario; 
		int num = 0;
		boolean primo=true;
		
		if (num==1) {
			primo=false;
		}
		
		// Pedir al usuario un número 
		System.out.println("Introduzca un número: ");
		numUsuario = reader.nextInt(); 
		
		for (int contador = 2; contador <= num; contador ++) {
			if (numUsuario%2 == 0) {
				System.out.println("El numero introducido no es primo? " + primo);  	
			} else {
				System.out.println("El numero introducido es primo?" + primo);  	
			}
		}
		
		// Cerrar Scanner 
		reader.close(); 
	}

}
