package Practice_ch06;

public class Excersice6_6 {

	
	//두 점 (x,y) 와 (x1,y1)의 거리를 구한다.
	
	static double getDistance(int x, int y, int x1, int y1) {
		int x2 = x-x1;
		int y2 = y1-y;
		
		return Math.sqrt((x2*x2) + (y2*y2));
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
		MyPoint mp = new MyPoint(1,1);
		System.out.println(mp.getDistance(2, 2));
		
	}
}

class MyPoint{
	int x;
	int y;
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y) );
	}
}
