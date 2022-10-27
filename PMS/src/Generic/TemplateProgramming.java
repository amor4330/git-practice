package Generic;

class Algorithm{

	//정수 2개를 더해서 결과를 return
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	//모양은 똑같지만 실수를 받아서 결과를 리턴하는 메서드 (메서드 오버로딩)
	public static Double add(Double n1, Double n2) {
		return n1+n2;
	}
	
	// 지금까지는 로직은 같지만 자료형이 다를 경우 오버로딩을 통해 메서드를 생성해왔다.
	
}

//자료형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형을 사용한 후
// 인스턴스를 생성할 때 자료형을 결정하는 방식을 이용
//단, 인스턴스를 만들 때 또느 메서드를 호출할 때 실제 자료형을 기재해야 한다.
//이 때 사용되는 자료형은 Object로부터 상속받은 클래스의 자료형만 가능하다.
//int와 primitive type의 경우에는 Integer와 같은 Wrapper 클래스를 이용한다.
//미저정 자료형의 개수는 제한이 없습니다.
//인스턴스를 만들 때 자료형을 설정하지 않으면 경고가 발생한다.
class Algorithm2 <T> { 
//	public T add(T n1, T n2) {
//		return n1 + n2;
//	}
	
	public void swap(T n1, T n2) {
		T imsi = n1;
		n1 = n2;
		n2 = imsi;
	}
}


//어떤 종류의 데이터든지 생성자에서 개수에 상관없이 받아서 처리하는 제너릭스
class Generics <T>{
	private T[] data;
	
	//... 은 variable args 로 개수에 상관없이 매개변수를 받고자할 때 사용
	//받은 매개변수를 배열로 만들어 준다.
	public Generics( T ...n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}

public class TemplateProgramming {

	
	public static void main(String[] args) {
		
		double d = Algorithm.add(1.5, 1.5);
		System.out.println(d);
		
		//제네릭이 적용된 클래스의 인스턴스를 만들 때 자료형을 기재해야 한다.
		//자료형을 기재하지않으면 경고가 발생하고 Object 타입으로 간주한다.
		
		Algorithm2 <Integer> algorithm = new Algorithm2<>();
		Integer n1 = 10;
		Integer n2 = 20;
		algorithm.swap(1, 2);
		System.out.println(n1);
		System.out.println(n2);
		
		
		Generics <String> g1 = new Generics<String> ("Karina", "Suzi", "IU");
		g1.display();
		Generics <Integer> g2 = new Generics<> (100, 300, 200, 400);
		g2.display();
		
	}
}
