package ejercicio03;

import java.util.Scanner;

public class Suma_Resta_Multiplicacion_Division {

	public static void main(String[] args) {
		
		//  Escribe un algoritmo que le pida al usuario dos 
		//  números. A continuación debe mostrar el siguiente 
		//	menú por pantalla:
		//		SUMAR LOS NÚMEROS
		//		RESTAR LOS NÚMEROS
		//		MULTIPLICAR LOS NÚMEROS
		//		DIVIDIR LOS NÚMEROS
		//  Después, el algoritmo debe pedirle al usuario que 
		//	seleccione una opción y que haga la operación que 
		//	marca esa opción, mostrando por último el resultado 
		//	de la operación elegida por el usuario. Si el 
		//	usuario elige una opción incorrecta, el algoritmo 
		//	se lo hace saber al usuario	y no haría nada.
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num1; 
		int num2; 
		int suma; 
		int resta; 
		int multiplicacion; 
		double division; 
		String operacion;
		
		// Pedir al usuario que introduzca 2 números
		System.out.println("Introduzca 2 números: ");
		num1 = reader.nextInt(); 
		num2 = reader.nextInt(); 
		
		// Pedir al usuario que elija entre las opciones 
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("Elije un valor entre A-D");
		operacion = reader.next(); 
		
		// Usar switch para operar segun la letra introducida por el usuario 
		switch (operacion) {
		case "A":  
			suma = num1 + num2; 	
			System.out.println("Suma = " + suma);
		
		case "B":  
			resta = num1 - num2; 	
			System.out.println("Resta = " + resta);
		
		case "C":  
			multiplicacion = num1 * num2; 
			System.out.println("Multiplicación = " + multiplicacion);
		
		case "D":  
			if (num2 != 0) {
				division = num1 / num2; 	
				System.out.println("División = " + division);
			} else {
			System.out.println("Error de cálculo");
			}
		
		default:  
			System.out.println("Error: introduzca un valor entre A-D");
		}
	
		// Cerrar Scanner
		reader.close(); 
	}
}