package gmail.amor4330.stack;

interface StarCraft {
	public void attack();
}

class Protoss implements StarCraft{
	@Override
	public void attack() {
		System.out.println("질럿 공격");
	}
}


public class AnonymousMain {

	public static void main(String[] args) {
		
		//인터페이스를 구현한 클래스를 만들고 인스턴스 만든 후 메서드를 호출한 것
		Protoss p = new Protoss();
		p.attack();
		
		//인터페이스를 구현한 클래스를 만들지않고 인스턴스를 바로 만드는 방법
		//클래스 내용을 단 한번만 사용할 경우 클래스는 계속 유지되기 때문에 메모리가 낭비될 수 있다.
		//단 한 번만 사용할 경우 다음의 방법은 클래스를 만들지않기 때문에 메모리에 이득
		//구현할 인터페이스 + 참조변수명 = new 인터페이스 {}; 후에 미구현 메서드 작성하여 사용
		StarCraft z = new StarCraft() {
			@Override
			public void attack() {
				System.out.println("저그 공격");
			}
			
		};
		z.attack();
		//////////////////////////////////////////////////////////////////////////////////////
		
		StarCraft star = new Protoss();
		star.attack();
		
		star = new StarCraft() {

			@Override
			public void attack() {
				System.out.println("저그 공격");
			}
		};
		
		star.attack();
		
		//////////////////////////////////////////////////////////////////////////////////////
		//변수도 만들지않고 인스턴스만 생성해서 메서드 호출 (가장 빠름 왜? 변수조차 만들지않았으니)
		//단 한 번만 사용할 경우 변수생성보다 그냥 호출하는게 제일 빠르다.
		new StarCraft() {
			@Override
			public void attack() {
				System.out.println("테란 공격");
			}
		}.attack();
		
		
		
	}//main
}
