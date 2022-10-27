package ch07;
import static java.lang.System.out;
import static java.lang.Math.*;

public class Ex7_11 {

	public static void main(String[] args) {
		
		
		//import static 으로 static 메서드를 클래스이름없이 사용 가능
		
//		System.out.println(); 에서 클래스 이름인 System 없이 사용 가능
		out.println("Hello");
//		Math.random() 에서 클래스 이름인 Math 없이 사용 가능
		out.println(random());
		
	}
}
