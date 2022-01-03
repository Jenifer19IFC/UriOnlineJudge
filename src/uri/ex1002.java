package uri;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		 Scanner input = new Scanner(System.in);
		 
		 double n = 3.14159;
		 double raio = input.nextDouble();	
		 double a = n * Math.pow(raio, 2);
			
		System.out.printf("A=%.4f%n", a);
			
		input.close();

	}

}
