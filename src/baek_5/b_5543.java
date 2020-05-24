package baek_5;

import java.util.Scanner;

public class b_5543 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int high = scanner.nextInt();
		int mid = scanner.nextInt();
		int low = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.print(Math.min(low, Math.min(high, mid))+Math.min(a, b)-50);
		
		scanner.close();
	}

}
