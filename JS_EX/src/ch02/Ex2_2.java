package ch02;

public class Ex2_2 {

	public static void main(String[] args) {
		
		//tmp 이용하여 두 변수의 값을 바꾸기
		
		int x = 10;
		int y = 5;
		System.out.println("x: " + x +" y: "+ y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x: " + x +" y: "+ y);
	}
}
