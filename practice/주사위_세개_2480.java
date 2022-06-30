package practice;

import java.util.Scanner;

public class 주사위_세개_2480 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && a == c && b == c) {
			System.out.println(10000 + (a * 1000));
		} else if(a == b) {
			System.out.println(1000 + (a * 100));
		} else if(a == c) {
			System.out.println(1000 + (a * 100));
		} else if(b == c) {
			System.out.println(1000 + (b * 100));
		} else if(a != b && a != c && b != c) {
			int max = a;
			if(b > max) max = b;
			if(c > max) max = c;
			System.out.println(max * 100);
		}
		
		sc.close();
		
	}

}
