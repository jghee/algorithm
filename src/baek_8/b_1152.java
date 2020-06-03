package baek_8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class b_1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		StringTokenizer strToken = new StringTokenizer(str," ");
		System.out.println(strToken.countTokens());
		
		scanner.close();

	}

}
