package Wrapper;

import java.util.Scanner;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//실수 문자열을 입력받아서 실수로 변경하고 추력하는 프로그램
		System.out.println("실수 입력");
		
		String su = scanner.nextLine();
		
		try {
		//문자열을 실수로 변경
//		Doouble silsu = new Double(su);
		Double silsu2 = Double.parseDouble(su);
		//문제가 발생시킬 수 있는 부분은 예외처리로 처리한다.
		
		//실수 문자열로
		
		String msg = silsu2.toString();
		System.out.println(msg);
		}catch(Exception e){
			System.out.println("변환에 실패");
		}
			
		scanner.close();
		
	}
}
