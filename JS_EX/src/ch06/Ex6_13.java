package ch06;

import java.util.Arrays;

public class Ex6_13 {

	public static void main(String[] args) {
		
		Ex6_13 ex = new Ex6_13();
		
		int arr[] = new int[4];
		ex.myMath(5, 10, arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}//main



	void myMath(int a, int b, int result[]) {
		result[0] = a + b;
		result[1] = a - b;
		result[2] = a * b;
		result[3] = a / b;
		
	}
}
