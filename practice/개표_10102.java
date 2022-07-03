package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class °³Ç¥_10102 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cntA = 0;
		int cntB = 0;
		int v = Integer.parseInt(br.readLine());
		String vote = br.readLine();
		
		for(int i=0; i<v; i++) {
			if(vote.charAt(i) == 'A') cntA++;
			else if(vote.charAt(i) == 'B') cntB++;
		}
		
		if(cntA == cntB) System.out.println("Tie");
		else System.out.println((cntA > cntB) ? 'A' : 'B');
		
		br.close();
		
	}

}
