package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {

    // 1. EJERCICIO 1
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		
		Integer precioTicket = 0; 
		
		if (edad < 0 || dia == null) {
			return -1; 
		}
		
		switch (dia) {
		case "LUNES"  -> precioTicket = 8; 
		case "MARTES" -> precioTicket = 8; 
		case "MIERCOLES" -> precioTicket = 8; 
		case "JUEVES" -> precioTicket = 8; 
		case "VIERNES" -> precioTicket = 10; 
		case "SABADO" -> precioTicket = 12; 
		case "DOMINGO" -> precioTicket = 12; 
		default -> System.out.println("Error: introduce un día de la semana de LUNES-DOMINGO");
		}
		
		if (edad < 12 || edad > 65) {
			precioTicket -= 3; 
		
			if (socio = true) {
				precioTicket -= 2;  
				}
		}
		
		return precioTicket; 
	}
		
		
	    // 2. EJERCICIO 2
		public static void dibujarZ(Integer lado) {
		    for (int i = 0; i < lado; i++) {
		        for (int j = 0; j < lado; j++) {
		            if (i == 0 || i == lado - 1 || j == lado - 1 - i) {
		                System.out.print("*");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println(); 
		    }
		}
		
	    // 3. EJERCICIO 3
		public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad) {
			
			Integer numerosEspeciales = 0; 
			Integer sumaNumerosEspeciales = 0; 
			
			if (inicio > fin || cantidad <= 0) {
				return 0; 
			}
			
			for (int i = inicio; i < fin; i++) {
				if (i!=1 && Utiles.esPrimo(i)|| Utiles.esPerfecto(i)) {
					if (numerosEspeciales >= cantidad) {
						break;
					}
					
					sumaNumerosEspeciales += i; 
					numerosEspeciales++; 
				}
			}
		return sumaNumerosEspeciales; 
		}
		
	    // 4. EJERCICIO 4
		public static Integer factorialConSaltos(Integer numero, Integer salto) {
			
			Integer res = 1; 
			Integer i = salto; 
			
			if (numero <= 0) {
				return res;
			} else {
				res = numero *= factorialConSaltos (numero - salto, salto); 
			}
			return res; 
		}
		
	    // 5. EJERCICIO 5
		public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
	        // Si la lista tiene menos de tres elementos, no puede tener picos intermedios
	        if (alturas == null || alturas.size() < 3) {
	            return 0;
	        }

	        int contadorPicos = 0;

	        // Recorremos desde el segundo elemento (índice 1) hasta el penúltimo (size() - 2)
	        for (int i = 1; i < alturas.size() - 1; i++) {
	            int actual = alturas.get(i);
	            int anterior = alturas.get(i - 1);
	            int siguiente = alturas.get(i + 1);

	            // Comprobamos si supera a ambos vecinos en al menos la diferencia mínima
	            if ((actual - anterior >= diferenciaMinima) && (actual - siguiente >= diferenciaMinima)) {
	                contadorPicos++;
	            }
	        }

	        return contadorPicos;
		}
		
		
}