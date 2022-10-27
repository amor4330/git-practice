package ch05;

import java.util.Arrays;

public class Ex5_10 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(numArr));

		/*
		 * 0번째 값을 1~9번째 값들과 비교하는데 0번쨰 값보다 작은 경우에 0번째값과 위치를 바꾸고 큰 경우는 유지한다. 이를 반복하면 제일 작은
		 * 값이 0번째에 위치하게 된다. 이후 1번째 값을 2~9번째 값들과 비교하는 방식을 반복해서 8번째 값까지 비교하면 된다.(8~9)
		 */

		// 배열의 마지막값과 마지막값을 비교할 필요없으므로 배열의 길이보다 1작은 값만큼 반복
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] >= numArr[j]) {
					int tmp = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
		
	}
}
