package ch06;

public class Ex6_16 {

	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		for(int i = 1; i <=21; i++) {
			result = FactorialTest2.factorial(n);
			
			if(result == -1) {
				System.out.println("유효하지 않은 값");
				break;
			}
		}
	}
}

class FactorialTest2{
	static long factorial(int n) {
		if(!(0 <= n && n <= 20)) return -1;
		else if(n <=1) return 1;

		return n * factorial(n-1);
	}
}