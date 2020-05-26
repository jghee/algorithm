package baek_6;

import java.util.Scanner;

public class b_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[];
		int n;
		int max;
		
		a = new int[9];
		n=1;
		
		for(int i=0;i<9;i++) {
			a[i]=scanner.nextInt();
		}
		max=a[0];
		for(int i=1;i<9;i++) {
			if(max<a[i]) {
				max = a[i];
				n=i+1;
			}
		}
		System.out.println(max);
		System.out.print(n);
		scanner.close();

	}

}