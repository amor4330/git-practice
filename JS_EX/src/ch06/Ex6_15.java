package ch06;

public class Ex6_15 {

	public static void main(String[] args) {
		
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial(i);
			if(result == -1) {
				System.out.println("유효하지 않은 값");
				break;
			}
			
			System.out.printf("%20d%n", result);
		}
		
	}
	
	static long factorial (int n) {
		if(n<=0 || n>20) return -1;
		else if(n<=1) return 1;
			return n * factorial(n-1);
	}
}

