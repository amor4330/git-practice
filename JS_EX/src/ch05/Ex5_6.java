package ch05;

import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];

		// 배열을 1~10 값으로 초기화
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		// 섞기 전 비교를 위해 배열 출력
		System.out.println(Arrays.toString(numArr));

		// 랜덤한 값을 받아서 해당 위치의 값을 첫 번째 값과 바꾸기
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 랜덤값 받기
			int tmp = numArr[n]; // 임시 변수 tmp에 n번째 값 저장
			numArr[n] = numArr[0]; // n 번에 첫 번쨰 값 저장
			numArr[0] = tmp; // 첫 번째에 tmp통해 저장해둔 n의 값 저장
		}
		System.out.println(Arrays.toString(numArr));
	}
}
