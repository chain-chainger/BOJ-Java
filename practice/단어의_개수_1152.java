package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의_개수_1152 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Boolean flag = false;
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) == ' ') {
				flag = false;
			} else {
				if (!flag) {
					flag = true;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		br.close();
		
	}

}
