package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1011{
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int R = input.nextInt();  
		
		double pi = 3.14159;


		
		double VOLUME = ((4/3.0) * pi * (Math.pow(R, 3)));
		

		System.out.printf("VOLUME = %.3f%n",  VOLUME);
		input.close();
 
    }
 
}