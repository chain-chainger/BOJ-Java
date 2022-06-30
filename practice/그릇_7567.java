package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ±×¸©_7567 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int height = 10;
		
		for(int i=1; i<str.length(); i++) {
			height += str.charAt(i) == str.charAt(i-1) ? 5 : 10;
		}
		
		System.out.println(height);
		
		br.close();
		
	}

}
