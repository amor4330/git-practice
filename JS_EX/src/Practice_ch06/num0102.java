

package Practice_ch06;

class sutDaCard{
	private int num;
	private boolean isKwang;
	
	//get set
	public void setNum(int num) {
		if(!(1<= num && num <=10)) return;
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setIsKwang(String isKwang) {
		if(isKwang.equals("광")) this.isKwang = true;
		else this.isKwang = false;
	}
	public boolean getIsKwang() {
		return isKwang;
	}
	
	//생성자
	public sutDaCard(){
		this(1, true);
	}
	
	public sutDaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//메서드
	public String info() {
		if(isKwang == true) return num + "K";
		else return num+"";}

}

public class num0102 {

	public static void main(String[] args) {
		sutDaCard card1 = new sutDaCard(3, false);
		sutDaCard card2 = new sutDaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
