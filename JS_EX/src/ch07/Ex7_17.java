package ch07;

public class Ex7_17 {

	public static void main(String[] args) {
		
		MyFireEngine fe = new MyFireEngine();
		MyCar car = new MyCar();
		
		if( fe instanceof Object) {
			System.out.println("fe는 Object로 형변환이 가능합니다.");
		}
		if( fe instanceof MyCar) {
			System.out.println("fe는 MyCar로 형변환이 가능합니다.");
		}
		if( fe instanceof MyFireEngine) {
			System.out.println("fe는 MyFireEngine로 형변환이 가능합니다.");
		}
		if( car instanceof MyFireEngine) {
			System.out.println("car는 MyFireEngine로 형변환이 가능합니다.");
		}else {
			System.out.println("car는 자손클래스인 FireEngine로 형변환이 불가하다.");
		}
		
		
	}//main
}//class

class MyCar{}
class MyFireEngine extends MyCar{}
