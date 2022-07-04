package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class »çºÐ¸é_9610 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[5];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x > 0 && y > 0) arr[0]++;
			else if(x < 0 && y > 0) arr[1]++;
			else if(x < 0 && y < 0) arr[2]++;
			else if(x > 0 && y < 0) arr[3]++;
			else arr[4]++;
		}
		
		for(int i=0; i<4; i++) {
			System.out.printf("Q%d: %d\n", i+1, arr[i]);
		}
		System.out.println("AXIS: " + arr[4]);
		
		br.close();
		
	}

}
