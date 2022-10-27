package ch04;

import java.util.Scanner;

public class ch04_28 {

	public static void main(String[] args) {
		
		/*
		 * 1과 100사이의 정수 answer에 저장
		 * 값을 맞출 때까지 반복
		 * 입력 값이 answer보다 낮으면 "더 높은 수로 시도하라"
		 * 입력 값이 answer보다 높으면 "더 낮은 수로 시도하라"
		 * 
		 */
		//Ex 4_28
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("1과 100사이의 수를 입력하세요. >");
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0;
//		
//		do {
//			String tmp = scanner.nextLine();
//			input = Integer.parseInt(tmp);
//			if(answer == input) {
//				System.out.println("정답입니다!");
//			}
//			else if(answer > input) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");
//			}else {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			}
//		}while(answer != input);
		
		//Ex 4_29
		/*
		 * 369 게임 / 369가 포함된 만큼 짝을 출력한다.
		 * 1~100까지 출력
		 * 
		 */
		
		int i = 1;
		while(i<=100) {
			if(i % 3 == 0) {
				System.out.print("짝");
				if( i >= 10 ) {
					if( (i / 10) % 3 == 0 ) {
						System.out.print("짝");
					}
					
			}System.out.println(" " + i);
			}
			i++;
		}
		
		
		
		
		
		
		
	}
}
