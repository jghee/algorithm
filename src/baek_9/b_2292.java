package baek_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        int k=1;
        
        for(int i=1;i<Integer.MAX_VALUE;i++) {
        	if(n<=sum) {
        		break;
        	}
        	else {
        		sum += i*6;
        		k++;
        	}
        }
        bw.write(String.valueOf(k));
        
        br.close();
        bw.close();
	}

}
