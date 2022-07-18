package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class √øΩ√∏¶_µµøÕ¡‡_11098 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, String> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int max = 0;
			int p = Integer.parseInt(br.readLine());
			map.clear();
			for(int j=0; j<p; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int value = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				map.put(value, name);
				if(max < value) max = value;
			}
			System.out.println(map.get(max));
		}
		
		br.close();
	
	}

}
