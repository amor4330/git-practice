package ch06;

public class Ex6_26 {
	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1(c1);
		
		System.out.printf("c1의 color = %s, gearType = %s, door = %d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d%n", c2.color, c2.gearType, c2.door);
		
		c1.door = 100;
		System.out.printf("c1의 color = %s, gearType = %s, door = %d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d%n", c2.color, c2.gearType, c2.door);
		
	}

}

class Car1{
	String color;
	String gearType;
	int door;
	
	Car1(){
		this("white", "auto", 4);
	}
	
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car1(Car1 c){
		color = c.color;			//this.를 사용하지않은 이유? -> color = color처럼 구분이 안되는 상황이 아니므로 ㅎㅎ; 굳이 this를 쓸 필요가 없다.
		gearType = c.gearType;
		door = c.door;
	}
}