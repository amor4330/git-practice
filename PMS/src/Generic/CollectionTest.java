package Generic;

import java.util.Arrays;

public class CollectionTest {

	
	public static void main(String[] args) {
		
		String[] arr = {"List", "Set", "Map"};
		//배열의 데어터를 수정하는 것은 가능하다.
		arr[2] = "HashTable";
		System.out.println(Arrays.toString(arr));
//		arr. .찍으면 사용가능한 메서드가 나오는데 배열은 데이터 추가 삭제가 안되므로 제공 x
		
		//arr 배열에 데이터를 추가하고 싶다면
		// 크기가 더 큰 배열을 생성
		String[] bigArr = new String[arr.length +1];
		//arr 복사
		for(int i = 0; i < arr.length; i++) {
			bigArr[i] = arr[i];
		}
		//bigArr에 추가하고자 하는 데이터 입력
		bigArr[bigArr.length-1] = "Properties";
		//bigArr이 가르키는 곳을 ar이 가르키도록 한다. (주소값을 변경)
		arr = bigArr;
		System.out.println(Arrays.toString(arr));
		
		String[] smallArr = new String[arr.length -1];
		
		for(int i = 0; i <smallArr.length; i++) {
			
		
		}
		System.out.println(Arrays.toString(smallArr));
		
		
	}
}
