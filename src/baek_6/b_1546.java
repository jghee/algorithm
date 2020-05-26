package baek_6;

import java.util.Scanner;

public class b_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int a[];
		double b[];
		int max=0;
		double sum =0;
		
		n = scanner.nextInt();
		a = new int[n];
		b = new double[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
			if(max<a[i])
				max = a[i];
		}
		for(int j=0;j<n;j++) {
			b[j] = (double)a[j]/max*100;
			sum = sum+b[j];
		}
		System.out.print(sum/n);
		scanner.close();
	}

}
