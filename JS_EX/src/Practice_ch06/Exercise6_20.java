package Practice_ch06;

import java.util.Arrays;

public class Exercise6_20 {

	static int[] shuffle(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
	
		int[] original = {1,2,3,4,5,6,7,8,9};
		shuffle(original);
		System.out.println(Arrays.toString(original));
		
	}//main
}//class

