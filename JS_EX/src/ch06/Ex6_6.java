package ch06;

public class Ex6_6 {
	
	public static void main(String[] args) {
		
		Math66 mm = new Math66();
		
		long result1 = mm.add(5, 4);
		long result2 = mm.subtract(10, 5);
		long result3 = mm.multiple(5, 4);
		double result4 = mm.divide(20, 3);
		
		System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);

	}
	

}

class Math66{
	long add(long a, long b) {return a+b;}
	
	long subtract(long a, long b) {return a-b;}
	
	long multiple(long a, long b) {return a * b;}
	
	double divide(double a, double b) {return a / b;}

	public static int random() {
		// TODO Auto-generated method stub
		return 0;
	}
}