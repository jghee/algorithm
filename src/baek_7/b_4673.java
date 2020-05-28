package baek_7;

public class b_4673 {
	
	public static void main(String[] args) {
		boolean[] SelfNum = new boolean[10001];
		
		for(int i=1;i<=10000;i++) {
			int dn = getDn(i);
			if(dn<=10000) {
				SelfNum[dn] = true;
			}
		}
		for(int i=1;i<SelfNum.length;i++) {
			if(!SelfNum[i]) {
				System.out.println(i);
			}
		}
	}
	private static int getDn(int n) {
		int dn = n;
		while(n>0) {
			dn +=n%10;
			n/=10;
		}
		return dn;
	}

}