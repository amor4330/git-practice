package gmail.amor4330.stack;

import java.util.PriorityQueue;
import java.util.Comparator;

public class MainClass2 {

	public static void main(String[] args) {
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 하는 클래스
		PriorityQueue <Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(50);
		intQueue.offer(30);
		intQueue.offer(70);
		intQueue.offer(10);
		
		//tree 구조여서 intQueue를 그대로 출력하면 이상하게 나온다.
		
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		PriorityQueue <PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		//PersonVO 클래스를 저장하는 우선순위 Queue
		
		//PersonVO의 크기 비교를 할 수 없기 때문에 예외 발생
//		persons.offer(new PersonVO(1, "짱구", new Date(100, 1, 1), "010-1111-2222"));
//		persons.offer(new PersonVO(1, "짱아", new Date(105, 7, 7), "010-3333-4444"));
		
		//PersonVO 클래스에 Comparable Interface를 implements 하여 compareTo라는 메서드를 재정의
		// OR Comparator 인터페이스를 대입핟을 수 있는 경우 Comparator 인터페이스를 구현한 클래스의 인스턴스를 이용해서 생성해도 된다.
		
		
		
	}
}
