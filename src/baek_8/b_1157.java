package baek_8;

import java.util.Scanner;

public class b_1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int n[] = new int[26];
		int k = 0;
		int max = 0;
		int max2 = 0;
		for(int i=0;i<n.length;i++) {
			n[i] = 0;
		}
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'A' :
			case 'a' :
				n[0]++;
				break;
			case 'B' :
			case 'b' :
				n[1]++;
				break;
			case 'C' :
			case 'c' :
				n[2]++;
				break;
			case 'D' :
			case 'd' :
				n[3]++;
				break;
			case 'E' :
			case 'e' :
				n[4]++;
				break;
			case 'F' :
			case 'f' :
				n[5]++;
				break;
			case 'G' :
			case 'g' :
				n[6]++;
				break;
			case 'H' :
			case 'h' :
				n[7]++;
				break;
			case 'I' :
			case 'i' :
				n[8]++;
				break;
			case 'J' :
			case 'j' :
				n[9]++;
				break;
			case 'K' :
			case 'k' :
				n[10]++;
				break;
			case 'L' :
			case 'l' :
				n[11]++;
				break;
			case 'M' :
			case 'm' :
				n[12]++;
				break;
			case 'N' :
			case 'n' :
				n[13]++;
				break;
			case 'O' :
			case 'o' :
				n[14]++;
				break;
			case 'P' :
			case 'p' :
				n[15]++;
				break;
			case 'Q' :
			case 'q' :
				n[16]++;
				break;
			case 'R' :
			case 'r' :
				n[17]++;
				break;
			case 'S' :
			case 's' :
				n[18]++;
				break;
			case 'T' :
			case 't' :
				n[19]++;
				break;
			case 'U' :
			case 'u' :
				n[20]++;
				break;
			case 'V' :
			case 'v' :
				n[21]++;
				break;
			case 'W' :
			case 'w' :
				n[22]++;
				break;
			case 'X' :
			case 'x' :
				n[23]++;
				break;
			case 'Y' :
			case 'y' :
				n[24]++;
				break;
			case 'Z' :
			case 'z' :
				n[25]++;
				break;
			}
		}
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max = n[i];
				k=i;
			}
			else if(max==n[i])
				max2 = n[i];
		}
		if(max==max2)
			System.out.print("?");
		else {
			switch(k){
			case 0:
				System.out.print("A");
				break;
			case 1:
				System.out.print("B");
				break;
			case 2:
				System.out.print("C");
				break;
			case 3:
				System.out.print("D");
				break;
			case 4:
				System.out.print("E");
				break;
			case 5:
				System.out.print("F");
				break;
			case 6:
				System.out.print("G");
				break;
			case 7:
				System.out.print("H");
				break;
			case 8:
				System.out.print("I");
				break;
			case 9:
				System.out.print("J");
				break;
			case 10:
				System.out.print("K");
				break;
			case 11:
				System.out.print("L");
				break;
			case 12:
				System.out.print("M");
				break;
			case 13:
				System.out.print("N");
				break;
			case 14:
				System.out.print("O");
				break;
			case 15:
				System.out.print("P");
				break;
			case 16:
				System.out.print("Q");
				break;
			case 17:
				System.out.print("R");
				break;
			case 18:
				System.out.print("S");
				break;
			case 19:
				System.out.print("T");
				break;
			case 20:
				System.out.print("U");
				break;
			case 21:
				System.out.print("V");
				break;
			case 22:
				System.out.print("W");
				break;
			case 23:
				System.out.print("X");
				break;
			case 24:
				System.out.print("Y");
				break;
			case 25:
				System.out.print("Z");
				break;
			}
		}
		
		scanner.close();

	}

}
