package uri;

import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tempoEmHoras = input.nextInt();
		int vel = input.nextInt();
		double dist = tempoEmHoras * vel;
		double litros = dist / 12;
		System.out.printf("%.3f\n", litros);
		
		input.close();
	}

}
