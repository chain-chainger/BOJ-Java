package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ¥ı«œ±‚_9085 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n;
		int sum;
		
		for(int i=0; i<t; i++) {
			n = Integer.parseInt(br.readLine());
			sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb);
		
		br.close();
		
	}

}
