package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 안정적인_문자열_4889 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int index = 1;
		boolean flag = false;
		String s;
		
		while(true) {
			stack.clear();
			s = br.readLine();
			int closeCnt = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '}') {
					if(stack.isEmpty()) {
						stack.add(0);
						closeCnt++;
					} else {
						stack.pop();
					}
				} else if(s.charAt(i) == '{') {
					stack.add(0);
				} else {
					flag = true;
					break;
				}
			}
			if(flag) break;
			sb.append(String.format(index + ". " + (((stack.size()+1)/2)+closeCnt) + "\n"));
			index++;
		}
		
		System.out.print(sb);
		
		br.close();
		
	}

}
