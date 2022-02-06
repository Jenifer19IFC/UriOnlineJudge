package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
 
    public static void main(String[] args) throws IOException {
 
    	Locale.setDefault(Locale.US);
     
		Scanner input = new Scanner(System.in);

		int X = input.nextInt();  
		double Y = input.nextDouble();  
	  
		double consumo = X / Y;
		
		System.out.printf("%.3f km/l%n", consumo);
		input.close();
 
    }
 
}