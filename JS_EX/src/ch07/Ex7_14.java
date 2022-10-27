package ch07;

public class Ex7_14 {
	
	public static void main(String[] args) {
		
//		Singleton s = new Singleton(); 기본생성자를 private 처리해서 생성불가
		
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		A a = new A();
		A a2 = new A();
		A a3 = new A();
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
	}

}

class A{
	
}

class Singleton{
	
	//메서드에서 사용될 수 있도록 static 참조변수 생성
	private static Singleton s = new Singleton();
	
	private static int count = 0;
	
	//기본생성자 접근제한
	private Singleton() {}
	
	//인스턴스 생성 메서드
	public static Singleton getInstance() {
		if(count > 2) {
			return s;
		}
		
		
		if(s == null) {
			s = new Singleton();
		}
		count ++;
		return s;
	}
	
}