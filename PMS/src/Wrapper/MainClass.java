package Wrapper;

import java.util.*;

public class MainClass{

	public static void main(String[] args) {
		
		PersonVO[] persons = {
				new PersonVO(1, "수지", 29), 
				new PersonVO(2, "아이유", 30), 
				new PersonVO(3, "김연아", 31),
				new PersonVO(4, "아담", 46)
		};
		
		//동적으로 정렬하기
		//1. 이름의 오름차순 2. 이름의 내림차순 3. 나이의 오름차순 4. 나이의 내림차순
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 이름의 오름차순 2. 이름의 내림차순"
				+ " 3. 나이의 오름차순 4. 나이의 내림차순");
		
		
		String menu = scanner.nextLine();
		//입력받은 값 좌우 공백제거
		switch (menu.trim()) {
		case "1":
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			});
			System.out.println("이름의 오름차순");
			break;
		case "2":
			System.out.println("이름의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					// TODO Auto-generated method stub
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;
		case "3":
			System.out.println("나이의 오름차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					// TODO Auto-generated method stub
					return o1.getAge() - (o2.getAge());
				}
			});
			break;
		case "4":
			System.out.println("나이의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					// TODO Auto-generated method stub
					return o2.getAge() - (o1.getAge());
				}
			});
			break;

		default: System.out.println("메뉴는 1~4번만 선택하세요.");
			break;
		}
		
		
		
		
		
		
		
		
		//배열을 대입하면 부등호 혹은 compareTo라는 메서드를 호출해서 크기 비교를 한 후 정렬을 수행한다.
//		Arrays.sort(persons);

		//동적으로 크기 비교하는 메서드를 설정
		
//		Arrays.sort(persons, new Comparator<PersonVO>() {
//
//			@Override
//			public int compare(PersonVO o1, PersonVO o2) {
//				// TODO Auto-generated method stub
//				return o2.getAge() - o1.getAge();
//			}
//			
//		});
		
		
//		System.out.println(Arrays.toString(persons));
//		//아래 문장은 실행 시 ㅇ러
//		System.out.println(persons);
		
		// PersonVO에는 크기르 비교를 할 수 있는 메서드가 존재하지 않기 때문.
		
		// personVO 클래스에 크기 비교하는 메서드 만ㅇ-ㅇ
		
	}

	
}
