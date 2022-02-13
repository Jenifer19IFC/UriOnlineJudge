package uri;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double t = 0;
		double x = input.nextDouble();
		double y = input.nextDouble();

		if(x == 1) {
			t = 4 * y;
		}else if(x == 2) {
			t = 4.50 * y;
		}else if(x == 3) {
			t = 5 * y;
		}else if(x == 4) {
			t = 2 * y;
		}else {
			t = 1.5 * y;
		}
		
		System.out.printf("Total: R$ %.2f%n", t);	
		
		input.close();
		
	}

}
