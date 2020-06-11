package baek_8;

import java.util.Scanner;

public class b_1316 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int count = 0;

		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			int arr[] = new int[26];
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(j - 1)) {
					if (arr[s.charAt(j) - 97] == 1) {
						++count;
						break;
					}
					arr[s.charAt(j - 1) - 97] = 1;
				}
			}
		}
		System.out.println(n-count);
		scanner.close();

	}

}
