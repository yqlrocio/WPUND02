package ejercicio02;

public class Numero_Mayor {

	public static void main(String[] args) {
		
	//	Escribir un programa que pida al usuario 
	//	tres números enteros, y que muestre por 
	//	pantalla el mayor de los 3. Supondremos 
	//	que los tres números son distintos.		
		
		Integer a = 3; 
		Integer b = 4; 
		Integer c = 5; 
		
		if (a > b && a > c) {
			System.out.println("El número mayor es --> " + a);
		} else if (b > a && b > c) {
			System.out.println("El número mayor es --> " + b);
		} else if (c > b && c > a) {
			System.out.println("El número mayor es --> " + c);
		}

	}

}
