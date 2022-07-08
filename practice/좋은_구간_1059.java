package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 좋은_구간_1059 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int min = 0, max = 1000;
		int[] arr = new int[l];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(s.nextToken());
			if(arr[i] > n) {
				max = Math.min(max, arr[i]);
			} else if(arr[i] < n) {
				min = Math.max(min, arr[i]);
			} else {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		System.out.println(((n-min-1)*(max-n-1)) + (n-min-1) + (max-n-1));
		
		br.close();
		
	}

}
