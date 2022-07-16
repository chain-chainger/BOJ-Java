package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사장님_도박은_재미로_하셔야_합니다_23795 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = 0;
		
		while(true) {
			int bet = Integer.parseInt(br.readLine());
			if(bet == -1) break;
			res += bet;
		}
		
		System.out.println(res);
		
		br.close();
		
	}

}
