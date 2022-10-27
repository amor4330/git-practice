package gmail.amor4330.stack;

import java.util.Date;

//여러개의 값을 묶어서 표현하기 위한 클래스 Value Object(VO)
//getter construct 만들지만 setter는 만들지않은 경우가 많다.
public class PersonVO {
	
	//번호, 이름, 생일, 연락처 저장
	private long num; 
	private String name;
	private Date birthDay;
	private String phone;
	
	
	//default constructor는 무조건 만들자!
	public PersonVO(){
		super(); //여기서 super 는 모든 클래스의 조상 Object를 뜻한다.
	};
	
	//setter메서드 이용할 경우 stack이 4번이나 쌓이기 때문에 
	//매개변수가 전부있는 생성자를 만드는 것이 코드가 간단하고 메모리도 절약할 수 있다.
	//AllArgsConstructor
	public PersonVO(long num, String name, Date birthDay, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.birthDay = birthDay;
		this.phone = phone;
	}
	
	//getter 만 있으면 읽기만 가능 - immutable data 
	//setter 를 만들 경우 읽기/쓰기 가능 - mutable data
	
	//읽기만 가능한 immutable data를 만들기 위해 getter만 생성
	long getNum() {
		return num;
	}

	String getName() {
		return name;
	}

	Date getBirthDay() {
		return birthDay;
	}

	String getPhone() {
		return phone;
	}

	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthDay=" + birthDay + ", phone=" + phone + "]";
	}
	
	
	
}
