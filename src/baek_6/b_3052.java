package baek_6;

import java.util.Scanner;

public class b_3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[42];

		int n = 0;
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int j=0;j<a.length;j++) {
			b[a[j]%42]=1;
		}
		for(int k=0;k<b.length;k++) {
			if(b[k]==1)
				n++;
		}
		System.out.print(n);
		scanner.close();

	}

}
