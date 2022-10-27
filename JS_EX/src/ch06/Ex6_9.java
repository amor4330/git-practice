package ch06;

public class Ex6_9 {

	public static void main(String[] args) {
		
		// 인스턴스 x와 static x의 비교?
		
		Data d = new Data();
		
		d.x = 10;
		
		System.out.println("change 이전 x의 값 = "+ d.x);
		change(d.x);
		
		System.out.println("change 이후 x의 값 = " + d.x);
		//기본형 매개변수는 변수의 값을 읽기만 할 뿐 변경은 불가능하다.
		
		
	}
	
	static void change(int x) {
		System.out.println("메서드 안에서 적용 전 " + x);
		x = 1000;
		System.out.println("메서드 안에서 적용 후 " + x);
	}
}


class Data {
	int x;
}
