package baek_6;
import java.util.Scanner;

public class b_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []a;
		int n;
		int max,min;
		
		n = scanner.nextInt();
		a = new int[n];
		for(int i =0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		max = a[0];
		min = a[0];
		for(int i =1;i<n;i++) {
			if(max<a[i])
				max = a[i];
			if(min>a[i])
				min = a[i];
		}
		System.out.print(min+" "+max);
		scanner.close();

	}

}
