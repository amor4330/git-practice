package ch07;

public class Ex7_20 {

	public static void main(String[] args) {
		
		Parent3 p = new Parent3();
		Child3 c = new Child3();
		
		System.out.println("p.x: " + p.x);
		p.method(); //Parent 메서드 실행
		
		p = new Child3();
		System.out.println("Child 인스턴스 p.x: " + p.x); //p 참조변수이므로 Parent x 출력
		p.method(); //Child 인스턴스 참조하므로 Child 메서드 실행
		System.out.println();
		
		System.out.println("c.x: " + c.x); //참조변수가 Child이므로 Child x 출력
		c.method();//Child 메서드 실행
		
	}//main
}


class Parent3{
	
	int x = 100;
	
	void method() {
		System.out.println("조상 메서드");
	}
	
}

class Child3 extends Parent3{
	int x = 200;
	
	void method() {
		System.out.println("super.x: " + super.x);
		System.out.println("this.x: " + this.x);
		System.out.println("x: " + x);
	}
	
}