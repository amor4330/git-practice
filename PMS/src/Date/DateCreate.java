package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		
		//현재시간을 갖는 Date 인스턴스
		Date currentTime = new Date();
		//출력
		System.out.println(currentTime);
		
		//원하는 날짜로 생성 1992.02.11 13:00
		Date birthDay = new Date(92, 1, 11, 13, 0 ,0);
		System.out.println(birthDay);
		
		//년도만 추출해서 출력
		System.out.println(birthDay.getYear()+1900);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(currentTime));
		System.out.println(sdf.format(birthDay));
		
		//년월일을 비교해서 년월일이 같으면 시간 과 분을 그렇지않으면 년월일을 출력
		
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println(ymd.format(currentTime));
		System.out.println(ymd.format(birthDay));
		
		
		
	}
}
