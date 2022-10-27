package ch03;

public class Ex3_8 {

	public static void main(String[] args) {

		int a = 1_000_000;  //1백만
		int b = 2_000_000;  //2백만
		
		long c = a * b; //  -14547599363
		System.out.println(c);
		/*
		 * long 타입에 담았음에도 왜 오버플로우가 발생하였는가?
		 * 연산의 결과를 담을 c는 long타입이지만
		 * 피연산자가 둘 다 int이기 때문에 결과도 int로 나왔기 떄문
		 * 그렇기 떄문에 a or b를 long타입으로 형변환해야한다.
		 */
		c = (long)a * b;
		System.out.println(c);
		
		
		
		
	}
}
