package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �����_������_��̷�_�ϼž�_�մϴ�_23795 {
	
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
