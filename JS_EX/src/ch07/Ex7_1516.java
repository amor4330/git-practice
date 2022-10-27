package ch07;

public class Ex7_1516 {	//다형성 - 참조변수의 형변환-

	public static void main(String[] args) {
		
		Car car = new Car();
		Car nullCar = null;
		FireEngine fe = new FireEngine();
		
		Car fe2 = fe; // 조상 참조변수에 자손 객체를 참조할 수 있다.
	
//		FireEngine car2 = (FireEngine) car; // 컴파일 시에는 문제가 없으나 멤버 사용 시 오류 발생한다.
		//그 이유는 조상 객체를 자손 타입에 참조시키는 것인데 자손타입의 멤버가 더 많으므로 다믈 수 없다.  
		
//		FireEngine fe = new Car(); 형변환없이는 객체 참조 불가
		
//		fe2.water(); 조상타입에 자손객체를 담았으므로 조상에 없는 메서드 사용불가
//		car2.water(); 조상객체를 자손타입에 담았기에 오류 발생
		if(car instanceof FireEngine) {
			System.out.println("car는 FireEngine 인스턴스다.");
			FireEngine fe4 = (FireEngine)car;
			fe4.drive();
		}
		else if(nullCar instanceof FireEngine){
			System.out.println("nullCar는 FireEngine 인스턴스다.");
			FireEngine fe5 = (FireEngine)nullCar;
			fe5.water();
			fe5.drive();
		}
		else if(fe instanceof FireEngine){
			FireEngine fe4 = (FireEngine)fe;
			System.out.println("fe는 FireEngine 인스턴스다.");
			fe4.water();
		}
		fe2.drive(); 
		fe2.stop();
		
		FireEngine fe3 = (FireEngine)fe2;
		fe3.water(); // 자손 객체를 조상타입에 받은 것을 다시 자손타입에 받을 경우 자손 메서드 실행 가능
		
	}//main
}//class


/*
 * 조상클래스 Car는 속성(색상, 문 개수)을 지니고 기능(운전, 멈춤,)을 지닌다.
 * 소방차는 Car를 상속받고 기능(물 뿌림)을 지니고 있다.
 */


class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("운전 실행");
	}
	
	void stop() {
		System.out.println("멈춤");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("물 뿌림");
	}
}