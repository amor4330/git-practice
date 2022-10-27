package ch04;

public class Ex4_30 {

	public static void main(String[] args) {
		
		
		 //숫자를 1부터 몇까지 더해야 100을 넘는지 알아내는 예제
		 
		
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i;
				if(sum >= 100)
					break;
			i++;
		}
		/*
		 * int i = 0으로 초기화하고
		 * sum += ++i 로 계산해도 된다.
		 */
		System.out.println("sum: " + sum + " i: " + i);
		
		
	}
}
