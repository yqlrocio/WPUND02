package ejemplo3_if;

public class EJEMPLO3 {

	public static void main(String[] args) {
		
		Integer year = 2007; 
		Integer month = 2; 
		Integer day = 30;
		
		if (year % 400 == 0) { 
			if (year%4 == 0 && year%100 != 0) {
				if (month == 2) {
					day = 29; 
					System.out.println(year + month + day);
				}
				System.out.println(year + month + day);
			}
			System.out.println(year + month + day);
		}
		
		
	}

}
