package ch07;

public class Ex7_21 {

	public static void main(String[] args) {
		
		Buyer mj = new Buyer(1000, 0);
		
		mj.buy(new Computer());
		System.out.println(mj);
		mj.buy(new UhdTv());
		System.out.println(mj);
		mj.buy(new SuperCar());
		System.out.println(mj);
		
		
	}//main
}//class


/*
 * Product 클래스에는 (가격, 보너스점수, 재고) 속성이 있고 매개변수로 가격을 받은 후 가격의 1/10을 보너스포인트로 가진다.
 * 
 * 자손클래스 Tv 가격 100원, Computer 200원, 
 * 
 * Buyer 클래스는 (돈, 보유 보너스점수) 속성이 있고, (돈 - 가격, 보유 점수 + 보너스점수) 기능이 있다.
 */


class Product{
	int price;
	double bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10.0;
	}
}

class UhdTv extends Product{
	
	UhdTv(){
		super(100);
	}
	public String toString() {
		return "UhdTv";
	}
}

class Computer extends Product{
	
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
	
}
class SuperCar extends Product{
	
	SuperCar(){
		super(1000);
	}
	public String toString() {
		return "SuperCar";
	}
	
}

class Buyer{
	int money;
	double bonusPoint;
	
	Buyer(int money, double bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		if(money >= p.price) {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p + "를 구매하였습니다.");
		}
		else {
			System.out.println("금액이 부족하여 " + p +"구매를 할 수 없습니다.");
		}
	}
	
	public String toString() {
		return "현재 보유하신 금액은 " + money + "원 이며, 현재 보너스 점수는 "+ bonusPoint + "점 입니다.";
	}
}