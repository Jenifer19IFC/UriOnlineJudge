package uri;
import java.util.Scanner;

public class Ex1040 {
 
    public static void main(String[] args) {
 
    	Scanner input =new Scanner(System.in);
	        
		float n1, n2, n3, n4, media, pontuacao, novaMedia;
		float a = 2, b = 3, c = 4, d = 1;
		  
		n1 =input.nextFloat();
		n2 =input.nextFloat();
		n3 =input.nextFloat();
		n4 =input.nextFloat();
		  
		media = ((n1 * a) + (n2 * b) + (n3 * c) + (n4 * d)) / 10;
		  
		if (media >= 7.0) {
		   System.out.printf("Media: %.1f\n", media);
		   System.out.print("Aluno aprovado.\n"); 
		}
		  
		 else if (media >= 5.0 && media <= 6.9) {
		   System.out.printf("Media: %.1f\n", media);
		   System.out.print("Aluno em exame.\n");
		   
		   pontuacao = input.nextFloat();
		   
		   System.out.printf("Nota do exame: %.1f\n",pontuacao);
		   novaMedia = (media + pontuacao) / 2;
		   
		   if (novaMedia >= 5.0) {
		    System.out.print("Aluno aprovado.\n");
		   }else {
		    System.out.print("Aluno reprovado.\n");
		    
		   }
		   
		   System.out.printf("Media final: %.1f\n",novaMedia);
		}
		  
		else if (media < 5.0) {
		  System.out.printf("Media: %.1f\n",media);
		  System.out.print("Aluno reprovado.\n");
	    }
		 
		input.close();
    } 
}