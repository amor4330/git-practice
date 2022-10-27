package gmail.amor4330.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	
	public static void main(String[] args) {
		
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//map 데이터 저장
		map.put("num", 1);
		map.put("name", "민재");
		map.put("job", "FrontOffice");
		//동일한 key에 데이터를 저장하면 이전 데이터가 삭제되고 수정된다.
		map.put("job", "Programmer");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		//존재하지 않는 key를 사용하면 자바는 null을 return
		System.out.println(map.get("age"));
		
		//모든 key에 접근할 수 있는 Set : Map의 최대 장점
		//Set<Key> keySet() : key들을 Set으로 리턴, Map에 저장된 모든 데이터를 순회하고자 하는 경우 이용된다.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
