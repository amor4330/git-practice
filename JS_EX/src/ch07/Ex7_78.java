package ch07;

public class Ex7_78 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
		
	}//main
}//class

class Point2 {
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x: " + x + "y: " + y;
	}
	
}

class Point3D extends Point2{	//조상클래스 생성자 이용하기
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y);
		/*
		 * this.x = x;
		 * this.y = y;
		 * 를 대신해서 조상클래스 생성자 super() 를 불러와 코드를 줄였다.
		 * 만약 super(); 대신 위 코드를 작성하였다면
		 * 조상클래스인 Point2 에서 기본생성자를 생성해야 오류가 안난다.
		 * 왜냐하면 위 코드도 super(); 가 생략되어있는데 기본생성자를 없을 경우 생성을 못하므로!
		 */
		this.z = z;
	}
	
	String getLocation() {	//메서드 오버라이딩
		return "x: " + x + ", y: " + y + ", z: " + z; 
	}
	
}