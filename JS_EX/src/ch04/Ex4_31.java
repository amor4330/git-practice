package ch04;

import java.util.Scanner;

public class Ex4_31 {

	public static void main(String[] args) {
		
		// 메뉴를 보여주고 선택하게 하는 예제
		// 메뉴를 잘못 선택한 경우 다시 선택
		// 종료(0)를 선택한 경우 종료
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴를 선택하세요. (종료:0)>");
			
			int menu = scanner.nextInt();
			
			if(menu == 0 || num == 2) break;
			else if(menu == 1) {
				System.out.println("square");
				System.out.println("메뉴로 돌아가시겠습니까? (1) Yes (2) No");
				num = scanner.nextInt();
				if(num == 1) continue;
				else break;
				
			}else if(menu == 2) {
				System.out.println("square root");
				System.out.println("메뉴로 돌아가시겠습니까? (1) Yes (2) No");
				num = scanner.nextInt();
				if(num == 1) continue;
				else break;
				
			}else if(menu == 3) {
				System.out.println("log");
				System.out.println("메뉴로 돌아가시겠습니까? (1) Yes (2) No");
				num = scanner.nextInt();
				if(num == 1) continue;
				else break;
				
			}else {
				System.out.println("잘못입력하셨습니다. 다시 선택해주세요.");
				continue;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
	}
}
