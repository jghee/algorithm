package baek_7;

import java.util.Scanner;

public class b_1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int m = 0;//�Ѽ��� ����
		
		n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(han(i)) m++;
		}
		System.out.print(m);
		scanner.close();

	}
	private static boolean han(int a) {
		if(a<100)		//100���� ���� ���� �׻� �Ѽ���
			return true;
		else if(a<1000) {
			int x = a/100;
			int y = a%100/10;
			int z = a%10;
			if(y-x == z-y)	//�� �ڸ����� ���� ���̶�� �Ѽ�
				return true;
		}
		return false;
	}

}
