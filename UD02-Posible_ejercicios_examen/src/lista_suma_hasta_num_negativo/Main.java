package lista_suma_hasta_num_negativo;

import java.util.ArrayList;
import java.util.List;

public class Main {

		// EJEMPLO DE LISTA
		
		/*
		 * Dado una lista de números, devuelveme la suma de los números hasta encontrarse un número negativo
		 */
		
		public static void main(String[] args) {
			
			List<Integer> lista = new ArrayList<>(); 
			
			System.out.println(lista);
			
			lista.add(2); 
			lista.add(3); 
			lista.add(4); 
			lista.add(-1); 
			lista.add(5); 
			
			System.out.println(lista);
			System.out.println(lista.size());
			System.out.println(pasosLaberinto(recorrido));

		}
		
		// Hacer un método que haga la suma hasta encontrarse un número negativo
		public static Integer pasosLaberinto(List<Integer> pasos) {
			
			Integer suma = 0; 
			int i = 0; 
			
			while (i < pasos.size()) {
				if (pasos.get(i)>0) {
				suma += pasos.get(i); 
			} else {
				break; 
			}
			i++; 
			
			return suma; 
		}

	}

