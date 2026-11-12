package utiles;

import java.util.List;

public class Utiles {

    // Un número primo es mayor que 1 y solo es divisible entre 1 y él mismo.
    public static boolean esPrimo(Integer numero) {
    	Boolean res = true;

        for (int divisor = 2; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                res = false;
            }
        }

        return res;
    }

    // Un número perfecto es positivo e igual a la suma de sus divisores propios.
    // Ejemplo: 6 = 1 + 2 + 3.
    public static boolean esPerfecto(Integer numero) {
    	Boolean res = false;
        Integer sumaDivisores = 0;
        for (int divisor = 1; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }
        if(sumaDivisores.equals(numero)) {
        	res = true;
        }
        return res;
    }
    
    //TODO factorial de un número
    public static int esFactrial(Integer numero) {
    
    	int factorial = 1; 
    	
    	for (int i = 1; i <= numero; i ++) {
    		factorial *= i; 
    		}
        
    	return factorial;
    }
    
    // Devuelve -1 para valores fuera de 0 a 20 (factorial con long).
    public static Long factorial(Integer numero) {
        Long resultado = -1L;
        if (numero != null && numero >= 0 && numero <= 20) {
            resultado = 1L;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }
    
    public static List<Integer> ordena(List<Integer> lis){
		Boolean ordenado = false;
		while (!ordenado) {
			ordenado=true;
			for(int i=0;i<lis.size()-1;i++) {
				Integer e = lis.get(i);
				Integer sig = lis.get(i+1);
				if (e>sig) {
					Integer aux = lis.get(i);
					lis.set(i, sig);
					lis.set(i+1, aux);
					ordenado=false;
				}
			}
		}
		return lis;
	}
}
