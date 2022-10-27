package ch06;

import java.util.Arrays;

public class Ex6_18 {

	public static void main(String[] args) {
		
		int result = 0;
		int x = 2;
		int n = 6;
		
		System.out.println(Power(2,6));
		
	}
	

	public static long Power (int x, int n) {
		if(n == 0) return 1;
		return x * Power(x, n-1);
	}	
}
