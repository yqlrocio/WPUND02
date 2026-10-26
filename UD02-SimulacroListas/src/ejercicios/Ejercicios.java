package ejercicios;

import java.util.List;
import utiles.Utiles;

public class Ejercicios {

    // 1. Sumar una lista mediante for-each.
    public static Integer suma1(List<Integer> numeros) {
        Integer suma = 0;

        for (Integer numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    // 2. Sumar una lista mediante for clásico (con índice).
    public static Integer suma2(List<Integer> numeros) {
        Integer suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return suma;
    }

    // 3. Sumar una lista mediante while.
    public static Integer suma3(List<Integer> numeros) {
        Integer suma = 0;
        int i = 0;

        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return suma;
    }

    // 4. Contar los números pares, incluido el 0.
    public static Integer contarPares(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    // 5. Contar los números primos mediante la clase Utiles.
    public static Integer contarPrimos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 6. Contar los números perfectos mediante la clase Utiles.
    public static Integer contarPerfectos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPerfecto(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 7. Calcular la media mediante for-each.
    public static Double media1(List<Integer> numeros) {
     
        Integer suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }

    // 8. Calcular la media mediante for clásico.
    public static Double media2(List<Integer> numeros) {

        Integer suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return (double) suma / numeros.size();
    }

    // 9. Calcular la media mediante while.
    public static Double media3(List<Integer> numeros) {

        Integer suma = 0;
        int i = 0;
        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return (double) suma / numeros.size();
    }
    
    //TODO Hacer aquí los ejercicios del examen 
    //los haremos con distintos bucles
    
    // EJ01. CONTROL DE ACCESO AL BAILE DE LOS MONSTRUOS
    public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {
    	Boolean res = false;
    
    	if (edad > 18 || acompanado == true || criatura == "vampiros") {
    		res = true; 
    	}
    	
        return res;
    }
    
    // EJ02. CLASIFICADOR DE CARAMELOS
    public static Integer cuentaCaramelos(List<String> caramelos, String tipo) { 
    	
//    	if (caramelos == null || tipo == null) {
//    		return 0; 
//    	}
    	
    	Integer cuentaCaramelo = 0;
    	
         for (String tipoCaramelo : caramelos) {
        	 
             if (tipo.trim().equalsIgnoreCase(tipoCaramelo.trim()))  {
            	 cuentaCaramelo ++;
             }
         }

         return cuentaCaramelo;
    }
         
     // EJ03. CONTADOR DE PASOS EN EL LABERINTO
     public static Integer pasosLaberinto(List<Integer> pasos) {
         Integer res = 0;
         int i = 0;

         while (i < pasos.size()) {
        	 Integer pasoActual = pasos.get(i);
        	 
        	 if (pasoActual < 0) {
        		 break; 
        	 }
        	 res += pasoActual; 
             i++;
         }

         return res;
    } 
     
     // EJ04. NIVEL MEDIO DE MAGIA EN LAS CALABAZAS 
     public static Double promedioMagia(List<Integer> niveles) {
    	 
    	 Integer suma = 0;
    	    int contador = 0;

    	    for (int i = 0; i < niveles.size(); i++) {
    	        if (niveles.get(i) >= 5) {
    	            suma += niveles.get(i);
    	            contador++;
    	        }
    	    }

    	    if (contador == 0) {
    	        return 0.0; // Para evitar la división por cero si ningún valor es >= 5
    	    }

    	    return (double) suma / contador;
     }

    
     
}
