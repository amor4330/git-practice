package ch06;

import java.util.Arrays;

public class Ex6_10___11 {
	public static void main(String[] args) {

		int[] arr = {6, 4, 3, 7, 8, 1, 10, 2};
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		Data d = new Data();
		d.x = 10;
		System.out.println("메서드 적용 전 x = "+ d.x);
		
		change(d);
		
		System.out.println("메서드 적용 후 x = "+ d.x);
		
//		int[] arr = new int[1];
//		change(arr);
//		System.out.println(arr[0]);
//		
		
		
	}
	
	static void change(Data d) {
		System.out.println("매개변수 before x = " + d.x);
		d.x = 1000;
		System.out.println("매개변수 after x = " + d.x);
	}
	
	static void change(int[] arr) {
		System.out.println("매개변수 before x = " + arr[0]);
		arr[0] = 1000;
		System.out.println("매개변수 after x = " + arr[0]);
	}
	
	
}
