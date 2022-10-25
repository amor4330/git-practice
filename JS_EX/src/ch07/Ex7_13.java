package ch07;

public class Ex7_13 {

	public static void main(String[] args) {
		
		Time t = new Time(17, 46, 25);
		
		System.out.println(t);
		
		t.setHour(12);
		System.out.println(t);
		
		
	}//main
}//class

class Time{
	//private 접근제어자를 통해 외부에서 접근 제한하였음. (같은 클래스에서만 사용 가능)
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	
	
	//getter, setter 생성
	public void setHour(int hour) {
		if(0 <= hour && hour <= 23) {
			this.hour = hour;
		}else return;
	}
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(0<= minute && minute <= 59) {
			this.minute = minute;
		}else return;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSecond(int second) {
		if(0<= second && second <= 59) {
			this.second = second;
		}else return;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}