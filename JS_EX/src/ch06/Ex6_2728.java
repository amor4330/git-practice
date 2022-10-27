package ch06;

public class Ex6_2728 {

	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		System.out.print("[");
		int count = 0;
		for(int i : bt.arr) {
			if(count == bt.arr.length-1) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ", ");
			count++;
		}
		System.out.print("]");
		
	}//main
}// class

class BlockTest{
	
	//클래스 초기화 블럭, 배열 생성 후 랜덤값으로 초기화
	static int[] arr = new int[5];
	static {
		System.out.println("클래스 초기화 블럭");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*11);
		}
	}
	//인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	//생성자
	BlockTest(){
		System.out.println("생성자");
	}
	
} //class