package baek_8;

import java.util.Scanner;

public class b_11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();
		String a[] = new String[n];
		int sum = 0;
		a = str.split("");
		for(int i=0;i<n;i++) {
			sum += Integer.parseInt(a[i]);
		}
		System.out.println(sum);
		scanner.close();
		
		
	}

}
