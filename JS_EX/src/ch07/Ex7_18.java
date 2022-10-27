package ch07;

public class Ex7_18 {
	
	public static void main(String[] args) {
		
		
		MyParent p = new MyParent();
		MyChild c = new MyChild();
		
		//메서드의 이름이 같은 경우 객체에 따라 작동한다.
		p.method(); //p가 Parent를 참조하고 있으므로 Parent메서드 작동
		c.method();
		System.out.println(p.x);
		System.out.println(c.x);
		
		p = new MyChild();
		p.method(); //p가 Child를 참조하고 있으므로 Child메서드 사용
		
		//멤버변수의 경우객체가 아닌 참조변수 타입에 따라 작동
		System.out.println(p.x); //Child 인스턴스를 참조하고 있어도 변수타입이 Parent이므로 p 멤버변수 호출
		
		
	
	}

}


// 조상, 자손의 멤버가 동일한 이름을 가졌을 경우

class MyParent{
	int x = 100;
	
	void method() {
		System.out.println("조상 메서드");
	}
}

class MyChild extends MyParent{
	int x = 200;
	
	void method() {
		System.out.println("자손 메서드");
	}
}