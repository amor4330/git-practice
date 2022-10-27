package ch07;

public class Ex7_1 {
	
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.power = true; 
		ctv.channel = 8;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.caption = true;
		ctv.displayCap("이것이 자막이다.");
		
		
		
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCap(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}