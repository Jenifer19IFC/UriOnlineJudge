package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1008 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int NUMBER = input.nextInt();
		int horaTrabalhada = input.nextInt();
		double valorHora = input.nextDouble();
		double salario = horaTrabalhada * valorHora;
	
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		input.close();
 
    }
 
}
