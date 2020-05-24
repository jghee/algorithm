package baek_5;

import java.util.Scanner;

public class b_10996 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i=1;i<=2*n;i++) {
			if(i%2==1) {
				for(int j=1;j<=n;j++) {
					if(j%2==1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			else {
				for(int j=1;j<=n;j++) {
					if(j%2==1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println("");
			
		}
		scanner.close();
	}

}
