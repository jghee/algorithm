package baek_6;

import java.util.Scanner;

public class b_8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String []a;
		String []t;
		int n = scanner.nextInt();
		int m = 0;
		int score=0;
		
		a = new String[n];
		
		for(int i=0;i<n;i++) {
			a[i]=scanner.next();
			t=a[i].split("");
			for(int j=0;j<t.length;j++) {
				if(t[j].equals("O"))
					m++;
				else if(t[j].equals("X"))
					m=0;
				score = score + m;
			}
			System.out.println(score);
			m=0;
			score =0;
		}
		scanner.close();

	}

}
