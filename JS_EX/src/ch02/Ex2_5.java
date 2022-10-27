package ch02;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {

		String url = "www.codechobo.com";

		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f %e %g%n", f1, f1, f1);
		System.out.printf("f2=%f %e %g%n", f2, f2, f2);
		System.out.printf("f3=%f %e %g%n", f3, f3, f3);
		System.out.printf("d=%.10f%n", d);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.5s]%n", url);

		Scanner scanner = new Scanner(System.in);
 
		String str1 = scanner.next();  
		String str2 = scanner.nextLine(); 
		System.out.println(str1);		
		System.out.println(str2);
		/* next()를 사용했을 때 안녕?(enter) 를 입력하면 enter 앞까지만 인식되고 (enter)가 그대로 남는다.
		 * nextLine()은 엔터를 입력하기 전까지 space를 포함한 한 줄을 입력값으로 받는데 next()남았던 enter때문에
		 * nextLine()에서 입력값을 받지못하고 그대로 넘어가버린다.
		 */

	}
}
