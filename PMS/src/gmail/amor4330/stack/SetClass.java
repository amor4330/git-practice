package gmail.amor4330.stack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
	
		//문자열을 저장하는 Set 인스턴스 3개
		
		Set<String> hashSet = new HashSet();
		Set<String> linkedHashSet = new LinkedHashSet();
		Set<String> TreeSet = new TreeSet();
		
		hashSet.add("choongAng");
		linkedHashSet.add("choongAng");
		TreeSet.add("choongAng");

		hashSet.add("39");
		linkedHashSet.add("39");
		TreeSet.add("39");

		hashSet.add("LG");
		linkedHashSet.add("LG");
		TreeSet.add("LG");

		hashSet.add("Zero");
		linkedHashSet.add("Zero");
		TreeSet.add("Zero");

		hashSet.add("zero");
		linkedHashSet.add("zero");
		TreeSet.add("zero");
		
				
		//데이터 출력
		//HashSet : 순서를 알 수 없음
		for(String company : hashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		//LinkedHashSet : 저장된 순서로 정렬
		for(String company : linkedHashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		//TreeSet : 오름차순으로 정렬 // 숫자 < 대문자 < 소문자
		for(String company : TreeSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
		
	}
}
