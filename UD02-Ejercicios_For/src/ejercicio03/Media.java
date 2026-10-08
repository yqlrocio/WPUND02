package ejercicio03;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		// Pedir diez números por teclado y mostrar la media.

		Scanner reader = new Scanner(System.in); 
		
		double media = 0; 
		
		for (int i = 1; i <= 10; i++) {
			Integer num; 
			System.out.println("Introduce una nota: ");
			num = reader.nextInt();
			
			media += num; 
		}
		media /= 3; 
		
		System.out.println(media);
		
		reader.close();
	}

}
