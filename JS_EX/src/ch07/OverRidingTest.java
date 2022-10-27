package ch07;

class MyPoint1 {
	int x;
	int y;
	
	void getMyLocation() {
		System.out.println("x: " + x + ", y: " + y);
	}
}

class MyPoint3D	extends MyPoint1{
	int z;
	
	void getMyLocation() {
		System.out.println("x: " + x + ", y: " + y + ", z: " + z);
	}
}

public class OverRidingTest {
	public static void main(String[] args) {
		
		MyPoint1 p1 = new MyPoint1();
		
		p1.x = 1;
		p1.y = 2;
		p1.getMyLocation();
		
		MyPoint3D p2 = new MyPoint3D();
		p2.x = 3;
		p2.y = 3;
		p2.z = 3;
		p2.getMyLocation();
	
	
	
	}
}
