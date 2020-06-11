package baek_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		int k = 1;
		int m = 1;

		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			if (n <= sum) {
				m = sum - n;
				break;

			} else {
				sum += i;
				k++;
			}
		}

		if (k % 2 == 0) {
			bw.write(String.valueOf(k - m) + "/" + String.valueOf(1 + m));
		} else {
			bw.write(String.valueOf(1 + m) + "/" + String.valueOf(k - m));
		}
		br.close();
		bw.close();

	}

}
