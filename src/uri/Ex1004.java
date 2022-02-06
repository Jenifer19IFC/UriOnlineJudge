package uri;

import java.util.Locale;
import java.util.Scanner;

public class Ex1004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int PROD = a * b;
		
		System.out.println("PROD = " + PROD);
		
		input.close();
	}

}
