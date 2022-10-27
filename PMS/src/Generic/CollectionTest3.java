package Generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	public static void main(String[] args) {
		//100000개의 데이터를 가진 ArrayList 와 LikedList 생성
		
		ArrayList <Integer> a1 = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			a1.add(i);}
		
		LinkedList <Integer> li = new LinkedList<>();
		for(int i = 0; i < 100000; i++) {
			li.add(i);
		}
		
		//ArrayList 에서 100000개의 데이터를 읽는데 걸리는 시간측정
		long start = System.currentTimeMillis();
		//데이터 가져오는 메서드 get(인덱스)
		for(int i = 0 ; i < 100000; i++) {
			System.out.println(a1.get(i));
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		//LinkedList 에서 100000개의 데이터를 읽는데 걸리는 시간
		start = System.currentTimeMillis();
		//데이터 가져오는 메서드 get(인덱스)
		for(int i = 0 ; i < 100000; i++) {
			System.out.println(li.get(i));
		}
		end = System.currentTimeMillis();

		System.out.println(end - start);
		
	
	}
}
