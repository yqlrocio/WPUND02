package ejercicio06;

import java.util.Scanner;

public class Clasificacion_suspenso {

	public static void main(String[] args) {
		
		// Pedir 5 calificaciones de alumnos y decir al 
		// final si hay algún suspenso.

		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables  
		double nota; 
		boolean AlgunSuspenso = true; 
		
		// Pedir al usuario que introduzca un número y usando el for calcularemos el factorial
		System.out.println("Introduce la calificación: ");
		nota = reader.nextInt(); 
		
		for (int i = 1; i <= 5; i ++) {
				System.out.println("Introduzca otra calificación: ");
				nota += reader.nextInt();  
			}
		
		if (nota < 5) {
			AlgunSuspenso = true;
		}
		if (AlgunSuspenso) {
			System.out.println("Hay al menos un alumno suspenso");
		} else {
			System.out.println("Todos los alumnos están aprobados");
		}
		
		// Cerramos Scanner
		reader.close(); 
		
	}

}
