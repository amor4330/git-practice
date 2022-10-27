package Wrapper;

import java.util.Arrays;

public class BinarySearchMethod {

	
	public static void main(String[] args) {
		
		
		String[] singers = {"장원영", "카리나", "지잴", "민지", "태연", "아이유", "수지"};
		
		int[] ranArr = new int[10];
		
		for(int i = 0; i <ranArr.length; i++) {
			ranArr[i] = (int)(Math.random()*20)+1;
		}
		System.out.println(Arrays.toString(ranArr));
		Arrays.sort(ranArr);
		int intResult = Arrays.binarySearch(ranArr, 5);
		if(intResult > 0) System.out.println("있음");
		else System.out.println("없음");
		
		//이분 검색 수행
		int result = Arrays.binarySearch(singers, "태연");
		System.out.println(result);  //-8 출력
		//sort를  하지않아서 잘못된 결과가 출력된다.
		

		Arrays.sort(singers);
		result = Arrays.binarySearch(singers, "태연");
		if(result > 0) {
			System.out.printf("%s은 %d에 위치합니다.%n", "태연", result);
			//인덱스여서 7번째에 위치하지만 6으로 출력됨
		}
		else {
			System.out.printf("%s은 리스트에 없습니다.%n", "태연" );
		}
		
		
		
	}
}
