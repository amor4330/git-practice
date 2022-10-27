package Practice_ch06;

public class Exercise6_22 {

	public static boolean isNumber(String str) {
		boolean answer = false;
		
		for(int i = 0; i < str.length(); i++) {
			if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				answer = true;
			}
			else {
				answer = false;
				break;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println("123 숫자? " + isNumber(str));
		String str2 = "12 3";
		System.out.println("123r 숫자? " + isNumber(str2));
	}
	
}
