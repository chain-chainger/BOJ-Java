package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 약수들의_합_9506 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(true) {
			arr.clear();
			arr.add(1);
			int sum = 1;
			int num = Integer.parseInt(br.readLine());
			
			if (num == -1) break;
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					arr.add(i);
					arr.add(num / i);
					sum += i + (num / i);
				}
			}
			
			Collections.sort(arr);
			
			if(sum == num) {
				StringBuilder sb = new StringBuilder();
				sb.append(num + " = 1");
				for(int i=1; i<arr.size(); i++) {
					sb.append(" + " + arr.get(i));
				}
				System.out.println(sb);
			} else {
				System.out.println(num + " is NOT perfect.");
			}
		}
		
		br.close();
		
	}

}
