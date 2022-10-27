package Random;

import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		
		//seed를 사용하지 않는 경우와 사용하는 경우의 차이'
		
		//자바에서 seed를 설정하지 않으면 seed가 랜덤
		Random r = new Random();
		System.out.println(r.nextInt());
		
		//seed를 설정하면 고정된 패턴의 숫자가 반환된다.
		r = new Random(42);
		System.out.println(r.nextInt());
		
		r = new Random();
		
		int[] ar = {-1, 1, 2, 3, 4, 5};
		//특정 요소의 확률을 높이고 싶으면 그 요소를 많이 집어넣으면 된다.
		//{-1, 1, 1, 1, 2, 2, 3, 4, 5}; 1, 2가 나올 확률이 높아진다.
		
		for(int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(6)+1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(ar[r.nextInt(ar.length)]);
		}
		
		//랜덤한 문자열 추출하는 것
		System.out.println(UUID.randomUUID().toString());
		
	}
	
}
