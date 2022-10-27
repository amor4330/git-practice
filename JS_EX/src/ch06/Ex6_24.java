package ch06;

public class Ex6_24 {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4; 
		
		System.out.printf("c1의 color = %s, gearType = %s, door = %d%n", c1.color, c1.gearType, c1.door);
		
		Car c2 = new Car("red", "auto", 4); //매개변수가 있는 생성자를 통해 코드가 더욱 간결해질 수 있다.
		System.out.printf("c2의 color = %s, gearType = %s, door = %d%n", c2.color, c2.gearType, c2.door);
		
	}
	
	
	
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){	//기본생성자를 다른생성자 호출로 초기화를 진행하였다.
		this("white", "auto", 4);
	} 
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}