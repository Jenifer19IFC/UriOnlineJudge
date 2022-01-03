package uri;
import java.io.IOException;
import java.util.Scanner;

public class ex1006 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double MEDIA = ((a * 2) + (b * 3) + (c * 5)) / 10;
		
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		input.close();
 
    }
 
}