package tema2;

import java.util.ArrayList;
import java.util.List;

public class UND02 {

    public static void main(String[] args) {

        int n = 5; // Tamaño de la matriz cuadrada (5x5)

        // =====================================================================
        // 1. DIAGONAL PRINCIPAL
        // =====================================================================
        System.out.println("--- DIAGONAL PRINCIPAL (i == j) ---");
        for (int i = 0; i < n; i++) {           // Bucle externo: filas
            for (int j = 0; j < n; j++) {       // Bucle interno: columnas
                if (i == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        // =====================================================================
        // 2. DIAGONAL SECUNDARIA
        // =====================================================================
        System.out.println("\n--- DIAGONAL SECUNDARIA (i + j == n - 1) ---");
        for (int i = 0; i < n; i++) {           // Bucle externo: filas
            for (int j = 0; j < n; j++) {       // Bucle interno: columnas
                if (i + j == n - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        // Pruebas rápidas de los métodos en el main
        List<Integer> datos = new ArrayList<>(List.of(10, 25, 12, 5, 30, 8));
        System.out.println("\nPares: " + contarPares(datos));
        System.out.println("Picos: " + contarPicos(datos, 10));
        System.out.println("Ordenada: " + ordenaBurbuja(datos));
    }

    // =========================================================================
    // 3. ESQUEMA CONTADOR
    // Objetivo: Contar cuantos elementos cumplen una condicion.
    // Clave: res empieza en 0 | Se recorre TODA la lista (sin break).
    // =========================================================================
    public static Integer contarPares(List<Integer> lis) {
        Integer res = 0;
        for (Integer e : lis) {
            if (e % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    // =========================================================================
    // 4. ESQUEMA SUMA (ACUMULADOR)
    // Objetivo: Sumar los valores (todos o los que cumplan una condicion).
    // Clave: res empieza en 0 o 0.0 | Se recorre TODA la lista.
    // =========================================================================
    public static Double sumaMayoresIgualesA(List<Double> lis, Double umbral) {
        Double res = 0.0;
        for (Double e : lis) {
            if (e >= umbral) {
                res += e;
            }
        }
        return res;
    }

    // =========================================================================
    // 5. ESQUEMA BUSQUEDA ("EXISTE AL MENOS UNO")
    // Objetivo: Saber si ALGUN elemento cumple la condicion.
    // Clave: res empieza en FALSE | Si encuentra uno -> res = true y BREAK.
    // =========================================================================
    public static Boolean existeMultiploDe5(List<Integer> lis) {
        Boolean res = false;
        for (Integer e : lis) {
            if (e % 5 == 0) {
                res = true;
                break; // Ya encontramos uno, no hace falta seguir mirando
            }
        }
        return res;
    }

    // Variacion de Busqueda: Devolver la PRIMERA POSICION (indice) o -1 si no esta
    public static Integer primeraPosicionDe(List<Integer> lis, Integer objetivo) {
        Integer pos = -1;
        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i).equals(objetivo)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    // =========================================================================
    // 6. ESQUEMA COMPROBACION ("PARA TODO" - TODOS CUMPLEN)
    // Objetivo: Saber si TODOS los elementos cumplen la condicion.
    // Clave: res empieza en TRUE | En cuanto UNO falle (!) -> res = false y BREAK.
    // =========================================================================
    public static Boolean todosPositivos(List<Integer> lis) {
        Boolean res = true;
        for (Integer e : lis) {
            if (!(e > 0)) { // Si encontramos uno que NO cumple
                res = false;
                break;      // Ya no se cumple para todos, paramos
            }
        }
        return res;
    }

    // Variacion de Comprobacion comparando vecinos (requiere indice 'i' desde 1)
    public static Boolean esCreciente(List<Integer> lis) {
        Boolean res = true;
        for (int i = 1; i < lis.size(); i++) {
            Integer actual = lis.get(i);
            Integer anterior = lis.get(i - 1);
            if (actual < anterior) {
                res = false;
                break;
            }
        }
        return res;
    }

    // =========================================================================
    // 7. ESQUEMA SELECCION (FILTRO)
    // Objetivo: Crear una NUEVA lista solo con los elementos que cumplen.
    // Clave: res empieza como new ArrayList<>() | Si cumple -> res.add(e).
    // =========================================================================
    public static List<Integer> seleccionaPares(List<Integer> lis) {
        List<Integer> res = new ArrayList<>();
        for (Integer e : lis) {
            if (e % 2 == 0) {
                res.add(e);
            }
        }
        return res;
    }

    // =========================================================================
    // 8. ESQUEMA MAXIMO / MINIMO
    // Objetivo: Obtener el mayor (o menor) elemento de la lista.
    // Clave: res empieza en NULL (evita fallo si la lista esta vacia []).
    // =========================================================================
    public static Integer maximo(List<Integer> lis) {
        Integer res = null;
        for (Integer e : lis) {
            // Para MINIMO cambiar (e > res) por (e < res)
            if (res == null || e > res) {
                res = e;
            }
        }
        return res;
    }

    // =========================================================================
    // 9. ORDENACION (METODO DE LA BURBUJA)
    // Objetivo: Ordenar la lista de menor a mayor intercambiando vecinos.
    // =========================================================================
    public static List<Integer> ordenaBurbuja(List<Integer> lis) {
        Boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < lis.size() - 1; i++) {
                Integer actual = lis.get(i);
                Integer siguiente = lis.get(i + 1);
                if (actual > siguiente) {
                    lis.set(i, siguiente);
                    lis.set(i + 1, actual);
                    ordenado = false; // Hubo cambio, hay que dar otra vuelta
                }
            }
        }
        return lis;
    }

    // =========================================================================
    // 10. EXTRA DE EXAMEN: RECORRIDO CON VECINOS (PICOS Y PAREJAS)
    // =========================================================================
    // Picos intermedios: recorre de i = 1 hasta size() - 2
    public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
        if (alturas == null || alturas.size() < 3) {
            return 0;
        }
        int picos = 0;
        for (int i = 1; i < alturas.size() - 1; i++) {
            int actual = alturas.get(i);
            int anterior = alturas.get(i - 1);
            int siguiente = alturas.get(i + 1);
            if ((actual - anterior >= diferenciaMinima) && (actual - siguiente >= diferenciaMinima)) {
                picos++;
            }
        }
        return picos;
    }
}