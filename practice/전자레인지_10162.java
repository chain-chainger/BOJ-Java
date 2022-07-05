package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162 {
	
	static void solve(int t) {
		int a = 0, b = 0, c = 0;
		
		while(t >= 300) {
			t -= 300;
			a++;
		}
		while(t >= 60) {
			t -= 60;
			b++;
		}
		while(t >= 10) {
			t -= 10;
			c++;
		}
		
		System.out.printf("%d %d %d\n", a, b, c);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		if(t % 10 != 0) {
			System.out.println(-1);
			System.exit(0);
		}
		solve(t);
		
		br.close();

	}

}
