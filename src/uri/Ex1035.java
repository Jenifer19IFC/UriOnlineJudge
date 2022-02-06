package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Leia 4 valores inteiros A, B, C e D. Então se B for maior que C e D for maior que A e se a soma de
		C e D for maior que a soma de A e B e se C e D forem valores positivos e se A for par, escreva a 
		mensagem “Valores aceitos” . Caso contrário, escreva a mensagem “Valores não aceitos” (Valores não aceitos).*/
		
		Scanner input = new Scanner(System.in);
		
		int a  = input.nextInt();
		int b  = input.nextInt();
		int c  = input.nextInt();
		int d  = input.nextInt();
		
		if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}

		input.close();
		
	}

}
