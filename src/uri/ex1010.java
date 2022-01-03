package uri;

import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int c1 = input.nextInt();
		int u1 = input.nextInt();
		double p1 = input.nextDouble();
		int c2 = input.nextInt();
		int u2 = input.nextInt();
		double p2 = input.nextDouble();
		double valor = u1 * p1 + u2 * p2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		input.close();
	}

}
