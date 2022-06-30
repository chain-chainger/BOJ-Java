package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���μ�����_11653 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				sb.append(i).append('\n');
				n /= i;
			}
		}
		
		if (n != 1) {
			sb.append(n);
		}
		
		System.out.println(sb);
		
	}

}
