package primo;

public class Primos {

	public static boolean esPrimo(int n) {
		
		boolean es = true; 
		for (int i=2; i < n; i++) {
			if (n%i==0) {
				es = true; 
				break; 
			}
		}

		return es; 
	}

}
