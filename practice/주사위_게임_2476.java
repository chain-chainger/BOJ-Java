package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �ֻ���_����_2476 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxPrize = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int prize;
			
			if(a == b && a == c && b == c) {
				prize = 10000 + (a * 1000);
			} else if(a == b) {
				prize = 1000 + (a * 100);
			} else if(a == c) {
				prize = 1000 + (a * 100);
			} else if(b == c) {
				prize = 1000 + (b * 100);
			} else {
				int max = a;
				if(b > max) max = b;
				if(c > max) max = c;
				prize = max * 100;
			}
			if (prize > maxPrize) maxPrize = prize;
		}
		
		System.out.println(maxPrize);
		
		br.close();
		
	}

}
