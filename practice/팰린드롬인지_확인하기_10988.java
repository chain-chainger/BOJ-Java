package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ӹ��������_Ȯ���ϱ�_10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(str.equals(sb.toString()) ? '1' : '0');
		
		br.close();
		
		}
	
}
