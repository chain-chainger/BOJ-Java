package practice;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class ¿∑≥Ó¿Ã_2490 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = {'D', 'C', 'B', 'A', 'E'};
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 0;
			while(st.hasMoreTokens()) cnt += Integer.parseInt(st.nextToken());
			sb.append(arr[cnt] + "\n");
		}
		
		System.out.print(sb);
		
		br.close();
		
	}

}
