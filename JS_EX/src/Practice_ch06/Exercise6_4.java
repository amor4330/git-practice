package Practice_ch06;

public class Exercise6_4 {

	public static void main(String[] args) {

//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("이름:" + s.name);
//		System.out.println("총점:" + s.getTotal());
//		System.out.println("평균:" + s.getAverage());
		
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}

}

class Student {
	//변수선언
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//생성자
	Student(){
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//메서드
	public String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", "
				+getTotal() + ", " + getAverage();
	}
	
	//getter
	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		int tmp = (int)(getTotal() /3f * 10 +0.5f);
		return tmp/10f;
	}
}