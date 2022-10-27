package ch06;

class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}


public class Ex6_1__3 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2.channel = 10;
		t2 = t1;
		t1.channelDown();
		
		System.out.println(t1.channel);
		System.out.println(t2.channel); // t2와 t1이 같은 주소값을 참조하고 있으므로 t1과 같은 값이 나온다.
		
		
		
	}
}

