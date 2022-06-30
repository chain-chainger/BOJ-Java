package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 학점계산_2754 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String grade = br.readLine();
		double score = 0;
		
		switch(grade.charAt(0)) {
		case 'A' : score = 4; break;
		case 'B' : score = 3; break;
		case 'C' : score = 2; break;
		case 'D' : score = 1; break;
		case 'F' : System.out.println("0.0"); System.exit(0);
		}
		switch(grade.charAt(1)) {
		case '+' : score += 0.3; break;
		case '-' : score -= 0.3; break;
		}
		
		System.out.printf("%.1f\n", score);
		
		br.close();
		
	}
	
}
