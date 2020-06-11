package baek_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result;
		int K, N;
		int apt[][] = new int[15][15];
		for (int i = 0; i < 15; i++) {
			apt[0][i] = i;
		}
		for (int i = 0; i < 15; i++) {
			apt[i][1] = apt[0][1];
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];				
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				bw.write(String.valueOf(apt[i][j])+" ");			
			}
			bw.write("\n");
		}
		bw.flush();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			K = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			result = apt[K][N];
			bw.write(String.valueOf(result)+ "\n" );
			bw.flush();
		}

		br.close();
		bw.close();

	}

}
