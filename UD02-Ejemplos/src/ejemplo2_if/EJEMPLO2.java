package ejemplo2_if;

public class EJEMPLO2 {

	public static void main(String[] args) {
		
		// Introducir 3 números y decir cuál es mayor
		
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
