package ch04;

import java.util.*;
import java.util.Scanner;

public class ch04_24 {

	public static void main(String[] args) {

		// Ex 4_24
		System.out.println("카운트 다운을 시작합니다.");
		int i = 11;
		while (i-- != 0) {
			System.out.println(i);
		}
		System.out.println("GAME OVER");

		// Ex 4_25
		Scanner scanner = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%-5d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리 수의 합 = " + sum);
		
		// Ex 4_26
		i = 0; sum = 0;
		while((sum+=++i) <= 100) {
			System.out.printf("%d = %d%n", i, sum);
		}
		
		
		
		
		
		
		

	}
}
