package gmail.amor4330.stack;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		
		//랜덤 숫자 추출
		
		Random r = new Random();
		
		//ArrayList 활용 : 중복된 값을 허용하므로 중복값 있는지 확인 필요
		ArrayList <Integer> a1 = new ArrayList<>();
		ArrayList <Integer> a2 = new ArrayList<>();
		
		//ArrayList Size가 6보다 작을 때 까지
		while(a1.size() < 6) {
				//1 ~ 45 숫자 랜덤 추출
			int su = r.nextInt(45) + 1;
			
			if(a1.contains(su)) continue; //중복값이 있을 경우 추가 없이 반복 재실행
			
			a1.add(su);
		}
		a1.sort(null);

//		while(a2.size() < 6) {
//			//1 ~ 45 숫자 랜덤 추출
//			int su = r.nextInt(45) + 1;
//			
//			if(a2.contains(su)) continue; //중복값이 있을 경우 추가 없이 반복 재실행
//			
//			a2.add(su);
//		}
//		
//		a1.sort(null);
//		a2.sort(null);
//		
//		boolean b = true;
//		int count = 0;
//		
//		while(b) {
//			if(a1.equals(a2)) {
//				System.out.println(count);
//				break;
//			}
//			else if( count >=  210000000 ) {
//				System.out.println(count);
//				break;
//			}
//			else count++;
//		}
		

		//TreeSet은 오름차순으로 정렬하고 중복값을 허용하지않으므로 ArrayList보다 코드가 간결하다.
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size() < 6) {
			int su = r.nextInt(45) + 1;
			
			treeSet.add(su);
		}
		for(Integer i : treeSet) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
	}
}
