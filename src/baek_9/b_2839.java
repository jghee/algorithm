package baek_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A, result, x;
		A = Integer.parseInt(br.readLine());
		x = A / 3;

		result = Integer.MAX_VALUE;
		for (int i = x; i >= 0; i--) {
			for (int j = 0; j <= x; j++) {
				if ((i * 3 + j * 5) == A) {
					result = Math.min(result, i + j);
				}
			}
		}
		if (result == Integer.MAX_VALUE)
			result = -1;

		bw.write(String.valueOf(result));

		br.close();
		bw.close();

	}

}
