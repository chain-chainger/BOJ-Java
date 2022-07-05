package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXÄûÁî_8958 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int score = 0, total = 0;
			String ox = br.readLine();
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					score += 1;
					total += score;
				} else {
					score = 0;
				}
			}
			System.out.println(total);
			total = 0;
		}
		
		br.close();
		
	}

}
