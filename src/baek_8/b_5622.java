package baek_8;

import java.util.Scanner;

public class b_5622 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String str = scanner.next();
		int a[] = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				a[i]=2;
				break;
			case 'D':
			case 'E':
			case 'F':
				a[i]=3;
				break;
			case 'G':
			case 'H':
			case 'I':
				a[i]=4;
				break;
			case 'J':
			case 'K':
			case 'L':
				a[i]=5;
				break;
			case 'M':
			case 'N':
			case 'O':
				a[i]=6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				a[i]=7;
				break;
			case 'T':
			case 'U':
			case 'V':
				a[i]=8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				a[i]=9;
			}
		}
		for(int i=0;i<a.length;i++) {
			sum +=a[i]+1;
		}
		System.out.println(sum);
		scanner.close();

	}

}
