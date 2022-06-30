package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 화성수학_5355 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {	
			StringTokenizer st = new StringTokenizer(br.readLine());
			double num = Double.parseDouble(st.nextToken());
			
			while(st.hasMoreTokens()) {
				String oper = st.nextToken();
				if(oper.equals("@"))
					num *= 3;
				else if(oper.equals("%"))
					num += 5;
				else if(oper.equals("#"))
					num -= 7;
			}
			
			System.out.printf("%.2f\n", num);
			
		}
		
		br.close();
		
	}
	
}
