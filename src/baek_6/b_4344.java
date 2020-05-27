package baek_6;

import java.util.Scanner;

public class b_4344 {
	
	static class Test{
		int score[];
		public Test(int n) {
			score = new int[n];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test test[];
		int n,m;
		int o = 0;
		int sum = 0;
		double avg;
		double p;
		
		n = scanner.nextInt();
		test = new Test[n];
		for(int i=0;i<n;i++) {
			m = scanner.nextInt();
			test[i] = new Test(m);
			for(int j=0;j<m;j++) {
				test[i].score[j] = scanner.nextInt();
				sum +=test[i].score[j];
			}
			avg = (double)sum/m;
			for(int k=0;k<m;k++) {
				if(test[i].score[k]>avg)
					o++;
			}
			p = (double)o/m*100;
			p = Math.round(p*1000)/1000.0;
			System.out.printf("%.3f%%\n",p);
			o = 0;
			sum = 0;
		}
		scanner.close();

	}

}
