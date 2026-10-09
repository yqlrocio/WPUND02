package ejercicio02;

import java.util.Scanner;

public class Dia_de_la_semana {

	public static void main(String[] args) {
		
		// Idear un programa que solicite al usuario un 
		// número comprendido entre 1 y 7, correspondiente 
		// a un día de la semana. Se debe mostrar el nombre 
		// del día de la semana al que corresponde. Por 
		// ejemplo, el número 1 corresponde a “Lunes” y el 
		// 6 a “Sábado”.

		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar día de la semana
		Integer diaSemana; 
		
		// Pedir al usuario por un número
		System.out.println("Introduce un número:");
		diaSemana = reader.nextInt(); 
		
		// Clasificar el número con un día de la semana
		switch (diaSemana) {
		case 1: 
			System.out.println("LUNES");
			break; 
		case 2: 
			System.out.println("MARTES");
			break;
		case 3: 
			System.out.println("MIÉRCOLES");
			break;
		case 4: 
			System.out.println("JUEVES");
			break;
		case 5: 
			System.out.println("VIERNES");
			break;
		case 6: 
			System.out.println("SÁBADO");
			break;
		case 7: 
			System.out.println("DOMINGO");
			break;
		}
		
		// Cerrar scanner
		reader.close();
		
	}

}
