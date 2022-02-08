package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		float r1 = 0;
		float r2 = 0;
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		float delta = (b * b) - 4 * a * c;
		float deno = 2 * a;
		
		if(deno == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			r1 = (float) ((-b + Math.sqrt(delta))/deno);
			r2 = (float) ((-b - Math.sqrt(delta))/deno);
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R2 = %.5f%n",r2);
		}
		
		input.close(); 
		
     /* Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double A, B, C, R1, R2;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if ((A == 0) | (B*B - 4*A*C < 0)) {
			System.out.println("Impossivel calcular");
		}
		else {
			R1 = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
			R2 = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
			System.out.println("R1 = " + df.format(R1));
				System.out.println("R2 = " + df.format(R2));
		} */

	}

}
