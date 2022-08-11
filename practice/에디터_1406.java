package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ¿¡µðÅÍ_1406 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> data = new Stack<>();
		Stack<Character> temp = new Stack<>();
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) data.push(str.charAt(i));
		for(int i=0; i<m; i++) {
			String cmd = br.readLine();
			switch(cmd.charAt(0)) {
			case 'L' :
				if(!data.empty()) temp.push(data.pop());
				break;
			case 'D' :
				if(!temp.empty()) data.push(temp.pop());
				break;
			case 'B' :
				if(!data.empty()) data.pop();
				break;
			case 'P' :
				data.push(cmd.charAt(2));
				break;
			}
		}
		while(!data.empty()) temp.push(data.pop());
		while(!temp.empty()) sb.append(temp.pop());
		
		System.out.println(sb);
		
		br.close();
		
	}
}
