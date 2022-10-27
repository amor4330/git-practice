package ch06;

public class Ex619 {
	
	public static void main(String[] args) {

		Mymath mm = new Mymath();
		
		mm.a = 5;
		mm.b = 10;
		System.out.println(mm.add());
		System.out.println(Mymath.add(5, 10));
		
		
	}

}

class Mymath{
	long a, b;
	
	//인스턴스 메서드 ( 덧셈, 뺄셈, 곱셈, 나눗셈 )
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiple() {return a * b;}
	double divide() {return a / b;}
	
	//static 메서드
	static long add(long a, long b) {return a + b;} // 오버로딩으로 같은 이름의 메서드, 다른 매개변수
	static long subtract(long a, long b) {return a - b;}
	static long multiple(long a, long b) {return a * b;}
	static double divide(long a, long b) {return a / b;}
	
}
