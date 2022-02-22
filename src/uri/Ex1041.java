package uri;

import java.util.Scanner;

public class Ex1041 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		/* Escreva um algoritmo que leia dois valores flutuantes (x e y), que devem representar as coordenadas
		 *  de um ponto em um plano. Em seguida, determine a qual quadrante o ponto pertence, ou se você está em um dos
		 *   eixos cartesianos ou na origem (x = y = 0).
		 *   */
		
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}else if(x == 0) {
			System.out.println("Eixo Y");
		}else if(y == 0) {
			System.out.println("Eixo X");
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		input.close();
	}

}
