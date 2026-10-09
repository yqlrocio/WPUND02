package ejercicio07;

import java.util.Scanner;

public class Piedra_Papel_Tijera {

	public static void main(String[] args) {
	
	//	Escribir un programa que simule el juego de PIEDRA, 
	//	PAPEL, TIJERA, pidiendo a cada jugador que escriba 
	//	PIEDRA, PAPEL o TIJERA. El juego debe mostrar por 
	//	pantalla quién ha ganado el juego tras jugar una 
	//	partida. Hay que contemplar el caso de que empaten.

		// Crear scanner
		Scanner reader = new Scanner(System.in);

		// Crear variable para almacenar las jugadas de los dos jugadores
		String jug1;
		String jug2;

		// Pedir al jugador 1 lo que va a sacar
		System.out.println("Turno del jugador 1: piedra/papel/tijera");
		jug1 = reader.nextLine();

		// Pedir al jugador 2 lo que va a sacar
		System.out.println("Turno del jugador 2: piedra/papel/tijera");
		jug2 = reader.nextLine();

		// Mostrar por pantalla quién gana
		if (jug1.equals("piedra") && jug2.equals("papel")) {
			System.out.println("GANA JUGADOR 2");

		} else if (jug1.equals("papel") && jug2.equals("tijera")) {
			System.out.println("GANA JUGADOR 2");

		} else if (jug1.equals("tijera") && jug2.equals("piedra")) {
			System.out.println("GANA JUGADOR 2");

		} else if (jug1.equals("tijera") && jug2.equals("papel")) {
			System.out.println("GANA JUGADOR 1");

		} else if (jug1.equals("papel") && jug2.equals("piedra")) {
			System.out.println("GANA JUGADOR 1");

		} else if (jug1.equals("piedra") && jug2.equals("tijera")) {
			System.out.println("GANA JUGADOR 1");

		} else if (jug1.equals(jug2)) {
			System.out.println("EMPATE");

		} else {
			System.out.println("¡ERROR! Debes escribir piedra, papel o tijera.");

		}

		// Cerrar scanner
		reader.close();
	}
}
		
