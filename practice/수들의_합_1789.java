package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의_합_1789 {
	
	static int solve(long s) {
		
		long sum = 0;
		int n = 0;
		
		while(s >= sum) {
			sum += ++n;
		}
		
		return sum > s ? n-1 : n;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long s = Long.parseLong(br.readLine());
		System.out.println(solve(s));
		
		br.close();
		
	}

}
