package lista_suma_hasta_num_negativo;

import java.util.ArrayList;
import java.util.List;

public class Main {

		// EJEMPLO DE LISTA
		
		/*
		 * Dado una lista de números, devuelveme la suma de los números hasta encontrarse un número negativo
		 */
		
		public static void main(String[] args) {
			
			List<Integer> recorrido = new ArrayList<>(); 
			
			System.out.println(recorrido);
			
			recorrido.add(2); 
			recorrido.add(3); 
			recorrido.add(4); 
			recorrido.add(-1); 
			recorrido.add(5); 
			
			System.out.println(recorrido);
			System.out.println(recorrido.size());
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

