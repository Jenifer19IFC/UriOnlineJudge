package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
 
    public static void main(String[] args) throws IOException {
 
       Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String nome = input.next();
		double salario = input.nextDouble();
		double vendasRealizada = input.nextDouble();
		double comissao = vendasRealizada * 0.15;
		
		double TOTAL = salario + comissao;
		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

		input.close();
 
    }
 
}