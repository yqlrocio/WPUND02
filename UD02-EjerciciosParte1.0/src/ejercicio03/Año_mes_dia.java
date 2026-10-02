package ejercicio03;

public class Año_mes_dia {

	public static void main(String[] args) {
		
	//	Escribir un programa que pida al usuario un mes 
	//	y un año y que muestre por pantalla el número 
	//	total de días que tiene ese mes de ese año. Hay 
	//	que considerar que los meses de febrero pueden 
	//	tener 29 o 28 días según el año sea o no bisiesto.
		
		Integer year = 2007; 
		Integer month = 2; 
		Integer day = null;
		
		boolean bisiesto = (year % 400 == 0) || (year%4 == 0 && year%100 != 0) ; 
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30; 
		} else if (month != 2){
			day = 31; 
		} else if (bisiesto) {
			day = 29; 
		} else {
			day = 28; 
		}
		
		System.out.println("El año " + year + " , mes " + month + ", tiene " + day + " días");
	}

}
