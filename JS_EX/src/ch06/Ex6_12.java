package ch06;

import java.util.Arrays;

public class Ex6_12 {

	public static void main(String[] args) {
		int[] arr = new int[] {50, 35, 1, 27, 10, 18};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		sumArr(arr);
		
		//printArr
		//sortArr
		//printArr
		//배열의 총합을 출력
		
	}//main
	
	
	
	static void printArr(int[] arr) {
		
		String str = "[";
		
		for(int i : arr) {
			str += i;
			if(i == arr[arr.length-1]) {
				str += "]";
			}
			str += ", ";
		}
		
		
//		System.out.println(Arrays.toString(arr));
	}//printArr
	
	static void sortArr(int[] arr) {
		int tmp = arr[0];
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}//sortArr
	
	static void sumArr(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("sum = %d", sum);
	}//sumArr
	
}
