package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬인지_확인하기_10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(str.equals(sb.toString()) ? '1' : '0');
		
		br.close();
		
		}
	
}
