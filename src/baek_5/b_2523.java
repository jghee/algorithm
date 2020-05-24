package baek_5;

import java.util.Scanner;

public class b_2523 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j;
		int n = scanner.nextInt();
		
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				for(j=1;j<=i;j++) 
					System.out.print("*");
				System.out.println("");
			}
			else {
				for(j=i;j<=2*n-1;j++) 
					System.out.print("*");
				System.out.println("");
			}
		}
		scanner.close();

	}

}
