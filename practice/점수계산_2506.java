package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산_2506 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int total = 0, score = 1;
		String ox[] = str.split(" ");
		
		for(int i=0; i<n; i++) {
			if(ox[i].equals("1")) {
				if(i != 0 && ox[i-1].equals("1")) score++;
				total += score;
			} else {
				score = 1;
			}
		}
		
		System.out.println(total);
		
		br.close();
		
	}

}
