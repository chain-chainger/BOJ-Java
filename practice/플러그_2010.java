package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �÷���_2010 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum - (n - 1));
		
		br.close();
		
	}

}
