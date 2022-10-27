package ch06;

public class Ex6_22 {

	public static void main(String[] args) {
		
		String[] strArr = {"이민재", "이수현", "아뵤"};
		
		System.out.println(concatenate("100", "200", "300", "400"));
		System.out.println(concatenate("-", "strArr"));
		System.out.println(concatenate(",", strArr));
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	
}
