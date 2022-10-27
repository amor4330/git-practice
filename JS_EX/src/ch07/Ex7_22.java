package ch07;

import java.util.Arrays;

public class Ex7_22 {
	
	public static void main(String[] args) {
		
		Buyer2 mj = new Buyer2(1500, 200);
		
		Ex7_22 shopping = new Ex7_22();
		
		mj.buy(new FhdTv());
		mj.buy(new Teslar());
		mj.buy(new SuperComputer());
		mj.buy(new Teslar());
		
		mj.summary();
		System.out.println(mj);
		
		
	}
	
	
}


/*
 * Product 클래스에는 (가격, 보너스점수, 재고) 속성이 있고 매개변수로 가격을 받은 후 가격의 1/10을 보너스포인트로 가진다.
 * 
 * 자손클래스 Tv 가격 100원, Computer 200원, 
 * 
 * Buyer 클래스는 (돈, 보유 보너스점수) 속성이 있고, (돈 - 가격, 보유 점수 + 보너스점수) 기능이 있다.
 */


class Products{
	int price;
	double bonusPoint;
	
	Products(int price){
		this.price = price;
		bonusPoint = price/10.0;
	}
}

class FhdTv extends Product{
	
	FhdTv(){
		super(100);
	}
	public String toString() {
		return "FhdTv";
	}
}

class SuperComputer extends Product{
	
	SuperComputer(){
		super(200);
	}
	public String toString() {
		return "SuperComputer";
	}
	
}
class Teslar extends Product{
	
	Teslar(){
		super(1000);
	}
	public String toString() {
		return "Teslar";
	}
	
}

class Buyer2{
	int money;
	double bonusPoint;
	
	Buyer2(int money, double bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	Product[] cart = new Product[2];
	int i = 0;
	
	void summary() {
		int sumPrice = 0;
		String itemList = "";
		System.out.println(Arrays.toString(cart));
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sumPrice += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("총 구매금액은 " + sumPrice + "원이며, 구매한 물품 목록은 " + itemList + "입니다.");
	}
	
	void buy(Product p) {
		if(i >= cart.length) {
			Product[] temp = new Product[cart.length *2];
			for(int j = 0; j < cart.length; j++) {
				temp[j] = cart[j];
			}
			cart = temp;
		}
		if(money >= p.price) {
			cart[i++] = p;
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