package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연세대학교_15680 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0)
			System.out.println("YONSEI");
		else if(n == 1)
			System.out.println("Leading the Way to the Future");
		
		br.close();
		
	}

}
