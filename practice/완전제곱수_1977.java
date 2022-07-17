package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 완전제곱수_1977 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = 0,min = 0, sum = 0;
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=100; i++) {
			val = (int)Math.pow(i, 2);
			if(val>n) break;
			if(val>=m && val<=n) {
				if (min == 0) min = val;
				sum += val;
			}
		}
		
		if(min == 0) System.out.println(-1);
		else System.out.printf("%d\n%d\n", sum, min);
		
		br.close();
		
	}

}
