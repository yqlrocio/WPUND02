package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {
		
		System.out.println("----------TEST DE CONTADORES----------");
		System.out.println(Ejercicios.cuentaParesDeLos20PrimerosNumeros());
		System.out.println(Ejercicios.cuentaParesHasta(20));
		System.out.println(Ejercicios.cuentaParesHasta(5000));
		System.out.println(Ejercicios.cuentaParesEntre(1, 20));
		System.out.println(Ejercicios.cuentaParesEn(List.of(5, 7, 3, 8, 7)));

		System.out.println("----------TEST DE SUMA----------");
		System.out.println(Ejercicios.sumaListaDeReales(List.of(5.5, 6.4, 9.52, 7.3, 3.1)));
	}

}
