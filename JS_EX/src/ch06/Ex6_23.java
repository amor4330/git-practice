package ch06;

public class Ex6_23 {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); error 발생, 왜? 생성자가 있으므로 컴파일러가 기본생성지 추가안함. 따로 기본생성자 작성요망
		Data2 d3 = new Data2(5);
		System.out.println(d3.value);
		
	}
}

class Data1 {
	int value;		//생성자가 없으므로 컴파일러가 자동으로 기본생성자 추가
}
class Data2 {
	int value;
	
	Data2(int x){	//매개변수가 있는 생성자
		value = x;
	}
}