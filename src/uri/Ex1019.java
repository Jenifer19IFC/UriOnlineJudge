package uri;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
	
	     int tempEmSeg = input.nextInt();
	     int h = tempEmSeg / 3600;
	     tempEmSeg -= h * 3600;
	     int min = tempEmSeg / 60;
	     tempEmSeg -= min * 60;
	     int seg = tempEmSeg;
	     System.out.println(h + ":" + min + ":" + seg);	

	     input.close();
	}

}
