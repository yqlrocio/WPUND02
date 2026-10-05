package ejercicio05;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		
	//	Pedir los coeficientes de una ecuación de segundo 
	//	grado y mostrar sus soluciones reales. Si no 
	//	existen, habrá que indicarlo. Hay que tener en 
	//	cuenta que las soluciones de una ecuación de 
	//	segundo grado: ax2 + bx + c = 0
		
		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar a, b, c, x1 y x2
		double a; 
		double b; 
		double c; 
		double x1; 
		double x2; 
		
		// Pedir al usuario por los valores de a, b y c
		System.out.println("Introduce el valor de a: ");
		a = reader.nextDouble(); 
		System.out.println("Introduce el valor de b: ");
		b = reader.nextDouble();
		System.out.println("Introduce el valor de c: ");
		c = reader.nextDouble();

		// Mostrar por pantalla las soluciones 
		if (b*b - 4*a*c >= 0) {
			System.out.println("HAY DOS SOLUCIONES");
			
			// Calcular el valor de x1 y x2
			x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
			x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
			
			// Mostrar las soluciones
			System.out.println("Las soluciones son: " + x1 + " y " + x2);
			
		} else if (b*b - 4*a*c == 0) {
			System.out.println("HAY UNA SOLUCIÓN");
		} else {
			System.out.println("NO HAY SOLUCIONES REALES");
		}

		// Cerrar scanner 
		reader.close();

	}

}
