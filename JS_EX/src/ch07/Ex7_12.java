package ch07;

public class Ex7_12 {

	public static void main(String[] args) {
		
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("SPAED", 10);
		
//		c1.NUMBER = 5; 에러발생한다. 상수는 변경할 수 없기 때문에
	
		System.out.println(c1);
		System.out.println(c2);
		
	}//main
}//class

class Card2{
	
	//상수는 선언과 동시에 초기화해주어야 하지만 지금같은 경우는 선언 이후 생성자 통해서 초기화를 진행한다.
	//이와 같은 방법은 상수가 인스턴스마다 서로 다른 값을 가지게 할 수 있다.
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card2(){
		this("HEART", 1);
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
		
}
