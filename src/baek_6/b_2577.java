package baek_6;

import java.util.Scanner;

public class b_2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		String k[];
		int b,c,d,e;
		String t;
		
		for(int i=0;i<10;i++) {
			a[i] = 0;
		}
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		e = b*c*d;
		t = Integer.toString(e);
		k=t.split("");
		for(int j=0;j<k.length;j++) {
			switch(Integer.parseInt(k[j])) {
				case 0: a[0]++;
						break;
				case 1: a[1]++;
						break;
				case 2: a[2]++;
						break;
				case 3: a[3]++;
						break;
				case 4: a[4]++;
						break;
				case 5: a[5]++;
						break;
				case 6: a[6]++;
						break;
				case 7: a[7]++;
						break;
				case 8: a[8]++;
						break;
				case 9: a[9]++;
						break;
			}
		}
		for(int m=0;m<a.length;m++) {
			System.out.println(a[m]);
		}
		scanner.close();

	}

}
