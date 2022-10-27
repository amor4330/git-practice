package Generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> a1 = new ArrayList<>();
		a1.add("One");
		a1.add("Three");
		
		//두 번째에 데이터를 100000개 추가하기
		long start = System.currentTimeMillis();
		for(int i = 0; i <20; i++) {
			a1.add(1, "Two");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		//문자열을 저장하는 LinkedList 생성
		LinkedList <String> li = new LinkedList<>();
		li.add("One");
		li.add("Three");
				
		start = System.currentTimeMillis();
		for(int i = 0; i <20; i++) {
			li.add(1, "Two");
		}
		end = System.currentTimeMillis();
				
		System.out.println(end-start);
		
		System.out.println(a1);
		System.out.println(li);
	}
}
