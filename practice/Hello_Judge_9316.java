package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello_Judge_9316 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			System.out.println("Hello World, Judge " + (i+1) + "!");
		}
		
		br.close();

	}

}
