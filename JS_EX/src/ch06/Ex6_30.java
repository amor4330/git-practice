package ch06;

public class Ex6_30 {

	public static void main(String[] args) {
		
		Document d1 = new Document();
		Document d2 = new Document("워드");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}//main
}//class

class Document{
	
	static int docuNum = 0;
	String docuName;
	
	Document(){
		++docuNum;
		System.out.println("문서 제목없음" + docuNum + "이 생성되었습니다.");
	}
	
	Document(String docuName){
		System.out.println("문서 " + docuName + "이 생성되었습니다.");
	}
	
}//class
