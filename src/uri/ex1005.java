package uri;

import java.io.IOException;
import java.util.Scanner;
public class ex1005 {

	public static void main(String[] args) {
			
		 Scanner input = new Scanner(System.in);
		 double a =input.nextDouble();
		 double b = input.nextDouble();
		 double media = ((3.5 * a) + (7.5 * b))/11;
		 System.out.println(String.format("MEDIA = %.5f" , media));
		    
		input.close();

	}

}
