package baek_5;

import java.util.Scanner;

public class b_10817 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>=b) {
			if(b>=c)
				System.out.print(b);
			else if(a>=c)
				System.out.print(c);
			else
				System.out.print(a);
		}
		else {
			if(a>=c)
				System.out.print(a);
			else if(b>=c)
				System.out.print(c);
			else
				System.out.print(b);
		}
		scanner.close();

	}

}
