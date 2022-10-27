package ch02;

public class Ex2_4 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);
		System.out.printf("c=%c, %d%n",c, (int)c);
		System.out.printf("finger=[%6d]%n",finger);
		System.out.printf("finger=[%-6d]%n",finger);
		System.out.printf("finger=[%06d]%n",finger);
		System.out.printf("hex=%x%n",hexNum);
		System.out.printf("octNum=%o, %d%n",octNum, octNum);
		System.out.printf("hexNum=%x, %d%n",hexNum,hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum),binNum); //???
		
		/*
		 * 2진수를 10진수로 표현하는 지시가가 없기 때문에 binNum 을 String으로 변환시키는 메서드
		 * Integer.toBinaryString(binNum) 을 사용 후 지시자 %s를 통해 출력하였다.
		 */
		
		
		
		
		
		
		
		
	}
}
