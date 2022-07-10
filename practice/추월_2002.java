package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ãß¿ù_2002 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> in = new HashMap<>();
		
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		int[] out = new int[n];
		
		for(int i=0; i<n; i++) {
			in.put(br.readLine(), i);
		}
		
		for(int i=0; i<n; i++) {
			out[i] = in.get(br.readLine());
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(out[i] > out[j]) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
		
		br.close();

	}

}
