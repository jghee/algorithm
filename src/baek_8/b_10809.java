package baek_8;

import java.util.Scanner;

public class b_10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[26];
		for(int i=0;i<a.length;i++) {
			a[i] = -1;
		}
		String S = scanner.next();
		String c[] = "abcdefghijklmnopqrstuvwxyz".split("");
		String str[] = S.split("");
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(str[i].equals(c[j])&&a[j]==-1)
					a[j] = i;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d ",a[i]);
		}
		scanner.close();

	}

}
