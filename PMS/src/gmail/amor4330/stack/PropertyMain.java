package gmail.amor4330.stack;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		//없는 키를 사용하면 null 이 리턴
		System.out.println(properties.getProperty("name"));
		
		properties.setProperty("Adam", "First Cyber Singer in Korea");
		properties.setProperty("강진축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤테일", "한국 최츠의 자체 3D 엔진 MMORPG");
		
		
		try {
//			properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myproject.properties"), "xml로 저장");
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		
		
		
		
		
		
		
	}//main
	
}
