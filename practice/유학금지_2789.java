package practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class 유학금지_2789 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(str.replaceAll("[CAMBRIDGE]", ""));
		
		br.close();
		
	}

}
