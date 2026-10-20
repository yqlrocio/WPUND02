package ejercicios;

import java.util.Scanner;

public class EJ01_Mostrar_20_num {

	public static void main(String[] args) {
		
		//Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).

		Scanner reader = new Scanner(System.in); 
		
		// for (int i=1; i<=20; i++) {
		// system.out.printlm(i);
		// }
		
		Integer i=1; 
		
		System.out.print("( ");
		
		do {
			System.out.print(i);
			i++;
			if (i != 21) {
			System.out.print(", ");
			}

		} while (i <= 20); 
		System.out.println(")");
		
		

		reader.close();
	}

}
