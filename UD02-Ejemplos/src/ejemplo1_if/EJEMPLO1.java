package ejemplo1_if;

import java.util.Scanner;

public class EJEMPLO1 {

	public static void main(String[] args) {
		
		// Es par o no
		
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
