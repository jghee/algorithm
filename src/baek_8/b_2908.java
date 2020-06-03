package baek_8;

import java.util.Scanner;

public class b_2908 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t = "";
		String r = "";
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		String a = Integer.toString(x);
		String b = Integer.toString(y);
		for(int i=2;i>=0;i--) {
			t+=a.charAt(i);
			r+=b.charAt(i);
		}
		if(Integer.parseInt(t)>Integer.parseInt(r))
			System.out.print(t);
		else
			System.out.print(r);
		
		scanner.close();

	}

}
