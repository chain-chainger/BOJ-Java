package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���_����_10039 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i] < 40 ? 40 : arr[i];
		}
		
		System.out.println(sum / 5);
		
	}

}
