package ch06;

public class Ex6_4 {
	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		
		//객체 생성하여 참조변수들에게 저장
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); 
		}
		
		System.out.printf("tvArr[0].channel = %d, tvArr[1].channel = %d, tvArr[2].channel = %d", tvArr[0], tvArr[1], tvArr[2]);
		
		
		
	}
}
