package ejercicio01;

import java.util.Scanner;

public class Clasificar_nota {

	public static void main(String[] args) {
		
		// Pedir una nota entera de 0 a 10 y mostrarla de 
		// la siguiente forma: insuficiente (de 0 a 4), 
		// suficiente (5), bien (6), notable (7 y 8) y 
		// sobresaliente (9 y 10).
		
		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar la nota
		Integer nota; 
		
		// Pedir al usuario por su nota
		System.out.println("Introduce tu nota");
		nota = reader.nextInt(); 
		
		// Clasificar la nota
		switch (nota) {
		case 0,1,2,3,4: 
			System.out.println("INSUFICIENTE");
			break; 
		case 5: 
			System.out.println("SUFICIENTE");
			break;
		case 6: 
			System.out.println("BIEN");
			break;
		case 7,8: 
			System.out.println("NOTABLE");
			break;
		case 9,10: 
			System.out.println("SOBRESALIENTE");
			break;
		}
		
		// Cerrar scanner
		reader.close();

	}

}
