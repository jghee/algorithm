package baek_7;

import java.util.Scanner;

public class b_1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int m = 0;//한수의 갯수
		
		n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(han(i)) m++;
		}
		System.out.print(m);
		scanner.close();

	}
	private static boolean han(int a) {
		if(a<100)		//100보다 작은 수는 항상 한수다
			return true;
		else if(a<1000) {
			int x = a/100;
			int y = a%100/10;
			int z = a%10;
			if(y-x == z-y)	//각 자리수가 같은 차이라면 한수
				return true;
		}
		return false;
	}

}
