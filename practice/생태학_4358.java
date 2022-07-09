package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class ปýลยวะ_4358 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		int cnt = 0;
		String name;
		
		while((name=br.readLine()) != null){
			if(map.containsKey(name)) {
				map.replace(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
			cnt++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			double ratio = 100.0 * map.get(key) / cnt;
			sb.append(String.format("%s %.4f\n", key, ratio));
		}
		System.out.print(sb);
		
		br.close();
		
	}

}
