package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÃÖ´ñ°ª_2562 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, index = 0, num = 0;
		
		for(int i=0; i<9; i++) {
			num = Integer.parseInt(br.readLine());
			if(num > max) {
				max = num;
				index = i+1;
			}
		}
		
		System.out.printf("%d\n%d\n", max, index);
		
		br.close();
		
	}

}
