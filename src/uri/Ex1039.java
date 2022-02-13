package uri;

import java.util.Locale;
import java.util.Scanner;

public class Ex1039 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double m = 0;
		
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		
		m = (2 * n1 + 3 * n2 + 4 * n3 + 1 * n4) / (2 + 3 + 4 + 1);
		
		System.out.printf("Mídia = %.1f%n",m);
		
		if(m >= 7){
			System.out.println("Aluno aprovado");
		}else if(m < 5) {
			System.out.println("Aluno reprovado");
		}else if(m >= 5 && m <= 6.9) {
			System.out.println("Aluno em exame");
			System.out.printf("Nota do exame =  %.1f%n", m);
		}
		

	}

}
