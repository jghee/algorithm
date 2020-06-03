package baek_8;

import java.util.Scanner;

public class b_2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int k=0;k<n;k++) {
			int m = scanner.nextInt();
			String str = scanner.next();
			String result = "";
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<m;j++) {
					result += str.charAt(i);
				}
			}
			result = result.replace(" ", "");
			System.out.println(result);

		}
		scanner.close();
	}

}
