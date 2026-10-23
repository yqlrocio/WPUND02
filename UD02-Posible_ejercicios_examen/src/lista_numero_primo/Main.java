package lista_numero_primo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// EJEMPLO DE LISTA
	
	/*
	 * Dado una lista de números, devuelvemo los números primos
	 */
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>(); 
		
		System.out.println(lista);
		
		lista.add(7); 
		lista.add(4); 
		lista.add(3); 
		lista.add(12); 
		
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(hacerSuma(lista));

	}
	
	// Hacer un método que haga suma
	public static Integer hacerSuma(List<Integer> lis) {
		Integer suma = 0; 
		
		for (int i=0; i < lis.size(); i++) {
			suma += lis.get(i); 
		}
		
		return suma; 
	}

}
