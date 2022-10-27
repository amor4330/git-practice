package ch06;

public class Ex6_29 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial number) = " + p1.s_n);
		System.out.println("p2의 제품번호(serial number) = " + p2.s_n);
		System.out.println("p3의 제품번호(serial number) = " + p3.s_n);
		
	}//main
}//class

class Product{
	//생성된 인스턴스의 수를 저장하기 위한 변수
	// 인스턴스 고유의 번호
	//인스턴스가 생성될 때마다 count 의 값을 1씩 증가시켜서 고유번호 증가
	
	static int count=0;
	int s_n;
	
	{
		++count;
		s_n = count;
	}
	
	Product(){
	}
	
}

