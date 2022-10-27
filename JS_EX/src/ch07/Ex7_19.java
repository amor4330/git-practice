package ch07;

public class Ex7_19 {

	public static void main(String[] args) {
		
		Parent2 p = new Parent2();
		Child2 c = new Child2();
	
		p.method();
		c.method(); //자손클래스에 이름이 같은 멤버변수가 없으므로 상속받은 조상멤버를 그대로 출력
		System.out.println(p.x);
		System.out.println(c.x);
		
		p = new Child2();
		System.out.println(p.x); // 중복된 멤버변수가 없으므로 조상멤버 그대로 출력
	
		
		
	}//main
}


class Parent2{
	int x = 10;
	
	void method() {
		System.out.println("조상 메서드");
	}
}

class Child2 extends Parent2{
	
}