package uri;
 
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1013 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();  
		int b = input.nextInt();  
		int c = input.nextInt();  
		
		int MAIORAB = (a + b + Math.abs(a - b))/ 2;
		int MAIORABC = (MAIORAB + c + Math.abs(MAIORAB - c))/ 2;

		System.out.println(MAIORABC + " eh o maior");
		input.close();
 
    }
 
}