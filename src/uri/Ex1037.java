package uri;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {

	public static void main(String[] args) {
		
		/*Você deve fazer um programa que leia um número de ponto flutuante e imprima uma
		 *  mensagem dizendo em qual dos seguintes intervalos o número pertence: [0,25] (25,50], 
		 *  (50,75], (75,100). número for menor que zero ou maior que 100, o programa deve imprimir
		 *   a mensagem “Fora de intervalo” que significa “Fora de intervalo”.*/

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		if(x >= 0 && x <= 25 ) {
			System.out.println("Intervalo [0,25]");
		}else if(x > 25 && x <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if(x > 50 && x <= 75) {
			System.out.println("Intervalo (50,75]");
		}else if(x > 75 && x <= 100) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		input.close();
			
	}

}
