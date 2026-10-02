package ejercicio04;

import java.util.Scanner;

public class Casi_Cero {

	public static void main(String[] args) {
		
	//	Implementar un programa que pida por teclado un 
	//	número decimal e indique si es un número casi-cero, 
	//	que son aquellos, positivos o negativos, que se 
	//	acercan a 0 por menos de 1 unidad, aunque 
	//	curiosamente el 0 no se considera un número 
	//  casi-cero. Es decir, un número casi-cero es el que 
	//  se encuentra en el intervalo (-1, 1), donde se 
	//  excluye el -1, el 0 y el 1.ç
		
		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar num
		double num; 
		
		// Pedir al usuario por un número
		System.out.println("Introduce un número decimal: ");
		num = reader.nextDouble();
	
		// Mostrar por pantalla si es o no un número casi-cero
		if (num == 0) {
			System.out.println("El número no es casi-cero");
		} else if (num < -1) {
			System.out.println("El número no es casi-cero");
		} else if (num > 1) {
			System.out.println("El número no es casi-cero");
		} else {
			System.out.println("El número es casi-cero");
		}
		
		// Cerrar scanner 
		reader.close();
	}

}
