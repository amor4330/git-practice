package ch06;

public class Ex6_21 {
	
	public static void main(String[] args) {
		
		Math621 mm = new Math621();
		int[] arr = {1,2,3,4,5};
		
		System.out.println(mm.add(3,5));
		System.out.println(mm.add(3L,5));
		System.out.println(mm.add(3,5L));
		System.out.println(mm.add(3L,5L));
		System.out.println(mm.add(arr));
		
	}
	
	
	
}

class Math621{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) -");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("long add(long a, int b) -");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) -");
		return a + b;
	}
	
	int add(int[] arr) {
		System.out.print("long add(int[] arr) -");
		int result = 0;
		for(int i : arr) {
			result += i;
		}
		return result;
	}
	
}