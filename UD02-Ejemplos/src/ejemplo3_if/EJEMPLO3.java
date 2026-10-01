package ejemplo3_if;

public class EJEMPLO3 {

	public static void main(String[] args) {
		
		Integer year = 2007; 
		Integer month = 1; 
		Integer day ;
		
		if (year % 400 == 0 && month == 2) { 
			System.out.println("El mes " + month + " del año " + year + " tiene " + day + " dias");
		} else if (year%4 == 0 && year%100 != 0 && month == 2) {
			System.out.println("El mes " + month + " del año " + year + " tiene " + day + " dias");
		} else {
			day = 28; 
			System.out.println("El mes " + month + " del año " + year + " tiene " + day + " dias");
		}
		
		
		
	}

}
