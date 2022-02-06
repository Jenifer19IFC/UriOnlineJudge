package uri;

import java.io.IOException;
import java.util.Scanner;

public class Ex1020 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);
		
		int idadeEmDias = input.nextInt();
		int anos = idadeEmDias / 365;
		idadeEmDias -= anos * 365;
		int meses = idadeEmDias / 30;
		idadeEmDias -= meses * 30;
		int dias = idadeEmDias;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		input.close();
 
    }
 
}