package ejercicio03;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		// Pedir diez números por teclado y mostrar la media.

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Creamos variable para almacenar las notas
		double media = 0; 
		
		// Mediante un bucle, introducir 10 notas y hacer la media
		for (int i = 1; i <= 10; i++) {
			Integer num; 
			System.out.println("Introduce una nota: ");
			num = reader.nextInt();
			
			media += num; 
		}
		media /= 3; 
		
		// Imprimir por pantalla la solución
		System.out.println(media);
		
		// Cerrar scanner
		reader.close();
	}

}
