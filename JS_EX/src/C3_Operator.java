
public class C3_Operator {
	public static void main(String[] args) {
		
		/* 3-1
		 
		 * 12
		 * True
		 * 13// x=3, y=2
		 * 5 x=5
		
		 * False * 2
		 * 5
		 * 66
		 * B
		 * b
		 * C
		 */
		
		//3-2
//		(int)(Math.round(numOfApples*0.1))*sizeOfBucket;
		
		//3-3
//		int num = 10;
//		System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수"));
		
		//3-4
//		int num = 456;
//		System.out.println((num/100)*100);
		
		//3-5
//		int num = 333;
//		System.out.println((num/10)*10 + 1);
		
		//3-6
//		int num = 24;
//		System.out.println(((num/10)+1)*10 - num);
		
		//3-7
//		int fa = 100;
//		float cel = (float)5/9 * (fa - 32);
//		
//		System.out.printf("F : %d", fa);
//		System.out.printf("C  %.2f", cel);
		
		//3-8

//		byte c = (byte)(a + b);
//		ch = (char)(ch + 2);
//		float f = (float)3 / 2;
//		long l = 3000 * 3000 * 3000L;
//		boolean result = d!=f2;
		
		//3-9
//		char ch = 'z';
//		boolean b = (('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) || ('0'<= ch && ch <= '9');
//		System.out.println(b);

		//3-10
		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
		System.out.println(lowerCase);
		
		
		
		
	}
}
