package Wrapper;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		
		
		//문자열
		String[] idle = {"소연", "우기", "슈화", "미연"};
		
		//배열 순회하면서 출력
		/*
		for(String singer : idle) {
			System.out.println(singer);
		}
		*/
		
		System.out.println(idle[0].compareTo(idle[1]));
		
		//선택정렬
		//1. 배열의 복제
		String [] copyAr = Arrays.copyOf(idle, idle.length);
		
		//첫 번째 부터 n-1번 째 데이터까지
		for(int i = 0; i<copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j<copyAr.length; j++) {
				//뒤에 있는 데이터가 더 크다면(작다면) 교환
				if(copyAr[i].compareTo(copyAr[j]) <0 ) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(copyAr));
		
		
	}
	
	
	
}
