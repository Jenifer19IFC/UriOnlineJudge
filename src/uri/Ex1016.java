package uri;

import java.util.Scanner;

public class Ex1016 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*Dois carros (X e Y) partem na mesma direção. O carro X sai com uma velocidade constante de 60 km / he o carro Y sai com uma velocidade constante de 90 km / h.

		Em uma hora (60 minutos) o carro Y pode distanciar-se 30 quilômetros do carro X, ou seja, pode se afastar um quilômetro a cada 2 minutos.

		Leia a distância (em km) e calcule quanto tempo leva (em minutos) para o carro Y percorrer essa distância em relação ao outro carro.

		Entrada
		O arquivo de entrada contém 1 valor inteiro.

		Saída
		Imprima o tempo necessário seguido da mensagem "minutos" que significa minutos em português.*/
		
		int d = input.nextInt();
		int t = (d * 60) / 30; //regra de 3 ----> 60 * V = X * 30 
		System.out.println(t + " minutos");
		
		input.close();
	
	}

}
