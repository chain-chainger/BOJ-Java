package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네_번째_점_3009 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[3];
		int[] y = new int[3];
		int dx, dy;
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(x[0] == x[1]) {
			dx = x[2];
		} else {
			dx = x[0] == x[2] ? x[1] : x[0];
		}
		if(y[0] == y[1]) {
			dy = y[2];
		} else {
			dy = y[0] == y[2] ? y[1] : y[0];
		}
		
		System.out.printf("%d %d", dx, dy);
		
		br.close();
		
	}

}
