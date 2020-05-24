package baek_5;

import java.util.Scanner;

public class b_10039 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int []a = new int [5];
		int avg=0;
		
		for(int i=0;i<5;i++) {
			a[i]=scanner.nextInt();
			if(a[i]>=40)
				avg += a[i];
			else
				avg+=40;
		}
		System.out.print(avg/5);
		scanner.close();

	}

}
