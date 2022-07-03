package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class not_cute_cute_10886 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int opinion = 0;
		
		for(int i=0; i<n; i++) {
			opinion = Integer.parseInt(br.readLine());
			if (opinion == 1) cnt++;
		}
		
		if(cnt > (n / 2)) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
		
		br.close();
		
	}

}
