package ejercicios;

import java.util.Scanner;

public class EJ05_Calcular_datos_estadisticos {

	public static void main(String[] args) {
		
		// Implementar una aplicación para calcular datos 
		// estadísticos de las edades de los alumnos de un centro 
		// educativo. Se introducirán datos hasta que uno de ellos 
		// sea negativo, y se mostrará: la suma de todas las edades 
		// introducidas, la media, el número de alumnos y cuántos 
		// son mayores de edad.

		
		// Create scanner
		Scanner reader = new Scanner(System.in);
		
		// Create variables
		int num;
		int contadorMayor = 0;
		int suma = 0;
		int media = 0;
		int contador = 0;

		// Ask the ages of the students
		System.out.println("Introduce las edades de los alumnos : ");
		num = reader.nextInt();
		
		// Then create a loop to sum up all the numbers and do the operations
		while (num>0) {
			contador++;
		System.out.println("Introduce las edades de los alumnos : ");
			suma += num; 
			if (num>=18) {contadorMayor++;}
			num = reader.nextInt();
			}
	
		media =  suma / contador;

		// Print the results
		System.out.println("La suma de todos las edades es de " + suma + " y la media es de " + media
				+ " y hay " + contadorMayor + " personas mayores de edad");

		// Close the scanner
		reader.close();
	}

}