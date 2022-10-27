package gmail.amor4330.stack;

import java.util.Date;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 STack을 생성
		
		Stack <PersonVO> stack = new Stack<>();
		
		//Stack 에 데이터 저장
		stack.push(new PersonVO(1, "이민재", new Date(92, 2, 11), "01011112222"));
		stack.push(new PersonVO(2, "이명재", new Date(94, 6, 15), "01011112222"));
		
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop()); 
//		데이터 2개인데 3번 pop을 하게될 경우 UnderFlow 발생 -프로그램에선 예외 발생(java.util.EmptyStackException)
		
		
	}
}
