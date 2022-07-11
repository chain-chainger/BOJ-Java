package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ¹ÝÁö_5555 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String find_str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			str += str;
			if(str.contains(find_str)) cnt++;
		}
		
		System.out.println(cnt);
		
		br.close();
		
	}

}
