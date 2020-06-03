package baek_8;

import java.util.Scanner;

public class b_2941 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			n++;
			if (i < str.length() - 1) {
				if (str.charAt(i) == 'c') {
					i++;
					if (str.charAt(i) != '=' && str.charAt(i) != '-')
						i--;
				} else if (str.charAt(i) == 'd') {
					i++;
					if (str.charAt(i) == '-');
					else if (str.charAt(i) == 'z' && i < str.length() - 1) {
						i++;
						if (str.charAt(i) != '=') i -= 2;
					} else i--;
				} else if (str.charAt(i) == 'l') {
					i++;
					if (str.charAt(i) != 'j')
						i--;
				} else if (str.charAt(i) == 'n') {
					i++;
					if (str.charAt(i) != 'j')
						i--;
				} else if (str.charAt(i) == 's') {
					i++;
					if (str.charAt(i) != '=')
						i--;
				} else if (str.charAt(i) == 'z') {
					i++;
					if (str.charAt(i) != '=')
						i--;
				}
			}

		}
		System.out.println(n);
		scanner.close();

	}

}
