package ejercicios;

import java.util.Scanner;

public class EJ03_Media_num_positivo {

	public static void main(String[] args) {
		
		// Escribe un programa que vaya pidiendo al usuario 
		// números enteros positivos que debe ir sumando. Cuando 
		// el usuario no quiera insertar más números, introducirá 
		// un número negativo y el algoritmo, antes de acabar, 
		// mostrará la media de los números positivos introducidos 
		// por el usuario.
		 
		//Create a Scanner
        Scanner sc = new Scanner (System.in);
        
        //The sum of the number
        int contador = 0;
        int suma = 0; 
        double media;
        
        //The numbers introduced by the user
        int num;
        
        //The console waits for the user to introduce a number
        System.out.println("Introduzca un número:");
        num = sc.nextInt();
        
        //We'll only sum the positive numbers, and stop when the user introduces a negative one
        while (num>=0) {
          ++ contador;
          suma += num;
            System.out.println("Siga introduciendo número:");
            num = sc.nextInt();
        } 
        
        media = (double) suma / contador; 
        
        //We will show the final result of the sum after the user has introduced a negative number
        System.out.println("La media de los números introducido es: " + media);
        
        //Close Scanner
        sc.close();

    }
}