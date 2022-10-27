package ch06;

public class Ex6_20 {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; 클래스 변수는 인스턴스 변수를 사용할 수 없다.
	static int cv2 = new Ex6_20().iv; //객체 생성 이후 사용이 가능하다.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); 클래스 메서드는 인스턴스 맴버 사용 불가
		Ex6_20 a = new Ex6_20();
		System.out.println(a.iv); // iv는 항상 객체생성 이후 사용가능.
	}
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
		//클래스, 인스턴스 변수 모두 다 사용가능.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod(); 클래스 메서드는 사용가능하지만 인스턴스 메서드는 객체 생성해야 함.
		Ex6_20 a = new Ex6_20();
		a.instanceMethod();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod();
		//모두 사용 가능.
	}
	
	
}
