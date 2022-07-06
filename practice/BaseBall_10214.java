package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaseBall_10214 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int aScore = 0, bScore = 0;
			for(int j=0; j<9; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				aScore += Integer.parseInt(st.nextToken());
				bScore += Integer.parseInt(st.nextToken());
			}
			if(aScore > bScore) System.out.println("Yonsei");
			else if(bScore > aScore) System.out.println("Korea");
			else System.out.println("Draw");
		}
		
		br.close();
		
	}

}
