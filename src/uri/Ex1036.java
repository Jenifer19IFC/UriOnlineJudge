package uri;

import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		float delta = (b * b) - 4 * a * c;
		float r1 = (float) ((-b + Math.sqrt(delta))/2 * a);
		float r2 = (float) ((-b - Math.sqrt(delta))/2 * a);
		
		input.close();

	}

}
