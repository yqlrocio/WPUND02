package test;

import java.util.List;
import ejercicios.Ejercicios;

public class TestEjercicios {

    public static void main(String[] args) {
    	        
        System.out.println("\n--- EJERCICIO 1 ---");
        System.out.println("El precio de la entrada sería: " + Ejercicios.precioEntrada(10, "SABADO", true));   // 7 
        System.out.println("El precio de la entrada sería: " + Ejercicios.precioEntrada(35, "LUNES", false)); // 8 
        System.out.println("El precio de la entrada sería: " + Ejercicios.precioEntrada(66, "VIERNES", true));   // 5 
        System.out.println("El precio de la entrada sería: " + Ejercicios.precioEntrada(-1, "LUNES", false));   // -1 

        System.out.println("\n--- EJERCICIO 2 ---");
        Ejercicios.dibujarZ(5);

        System.out.println("\n--- EJERCICIO 3 ---");
        System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));   //  10 (2 + 3 + 5) 
        System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5)); // 23 (2 + 3 + 5 + 6 + 7) 
        System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));   // 24 (11 + 13)

        System.out.println("\n--- EJERCICIO 4 ---");
        System.out.println(Ejercicios. factorialConSaltos(7, 2));   //   7 × 5 × 3 × 1 = 105
        System.out.println(Ejercicios. factorialConSaltos(8, 3)); //  8 × 5 × 2 = 80
        System.out.println(Ejercicios.factorialConSaltos(5, 1));   //  5 × 4 × 3 × 2 × 1 = 120

        System.out.println("\n---  EJERCICIO 5 ---");
        System.out.println("El pico sería --> " + Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2)); // 3
        System.out.println("El pico sería --> " + Ejercicios.contarPicos(List.of(2, 5, 4, 7, 4), 3)); // 1
        System.out.println("El pico sería --> " + Ejercicios.contarPicos(List.of(1, 2), 1)); // 0
        
        System.out.println("\n--- EJERCICIO 6 ---");
        System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 9)); // 1
        System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 13)); // 2; 
        System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(0, 31), 0)); // 0
        System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153), 18)); // -1

        System.out.println("\n--- EXERCISE 7 ---");
        System.out.println(Ejercicios.countNonOverlappingPairs(List.of(2, 3, 2, 8, 7))); //2
        System.out.println(Ejercicios.countNonOverlappingPairs(List.of(1, 2, 3))); // 1
        System.out.println(Ejercicios.countNonOverlappingPairs(List.of(1, 1, 1))); // 0

    }
}
