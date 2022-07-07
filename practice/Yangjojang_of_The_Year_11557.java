package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yangjojang_of_The_Year_11557 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] universities = new String[n];
			int drink = 0, index = 0, max = 0;
			
			for(int j=0; j<n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				universities[j] = st.nextToken();
				drink = Integer.parseInt(st.nextToken());
				if(drink > max) {
					index = j;
					max = drink;
				}
			}
			
			System.out.println(universities[index]);
		}
		
		br.close();
		
	}

}
