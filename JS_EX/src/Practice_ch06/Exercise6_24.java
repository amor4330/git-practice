package Practice_ch06;

public class Exercise6_24 {

	public static int abs(int n) {
		return n >= 0 ? n : -n;
	}
	
	public static void main(String[] args) {
		int  n = -5;
		System.out.println(abs(n));
		n = 10;
		System.out.println(abs(n));
	}
}
