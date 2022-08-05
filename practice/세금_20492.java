package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ¼¼±Ý_20492 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = n - (int)(n * 0.22);
		int b = n - (int)(n * 0.2 * 0.22);
		
		System.out.println(a + " " + b);
		
		br.close();
		
	}
}
