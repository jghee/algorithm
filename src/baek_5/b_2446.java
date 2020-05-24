package baek_5;

import java.util.Scanner;

public class b_2446 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = 2*n-1;
		
		for(int i=1;i<=t;i++) {
			if(i<=n) {
				for(int j=1;j<=t;j++) {
					if(j<i)
						System.out.print(" ");
					else if(j>t-i+1);
					else
						System.out.print("*");
				}
			}
			else {
				for(int j=1;j<=2*n-1;j++) {
					if(j<=t-i)
						System.out.print(" ");
					else if(j>=2*n-1-t+i+1);
					else
						System.out.print("*");
				}
			}
			if(i!=t)
				System.out.println("");
		}
		scanner.close();

	}

}
