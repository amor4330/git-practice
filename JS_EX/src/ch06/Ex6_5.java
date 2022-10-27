package ch06;

public class Ex6_5 {
	
	public static void main(String[] args) {
		
		//static이 붙은 값은 객체생성 없이도 가능하다.
		Card.width = 100;  //또한 객체가 아닌 클래스이름으로 호출하는 것이 가독성에 좋다.
		Card.height = 250;
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "spade";
		c1.number = 7;
		
		System.out.println("Card1의 크기는 " + c1.width + " x " + c1.height + " 입니다.");
		System.out.println("Card1의 모양은 "+ c1.kind +" 숫자는 " + c1.number + "입니다.");

		
		c1.width = 120;		//객체를 통해서 클래스 변수 변경이 가능하지만 객체와 햇갈릴 수 있으므로
		c1.height = 275;	//클래스명을 사용하는 것이 좋다.
		c2.kind = "heart";
		c2.number = 1;
		
		System.out.println("Card2의 크기는 " + c2.width + " x " + c2.height + " 입니다.");
		System.out.println("Card2의 모양은 "+ c2.kind +" 숫자는 " + c2.number + "입니다.");
		
	}
}

class Card {
	String kind;
	int number;
	static int width;
	static int height;
}