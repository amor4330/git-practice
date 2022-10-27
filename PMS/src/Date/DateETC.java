package Date;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {

	public static void main(String[] args) {
		
		
		//날짜와 시간을 다른 형태로 사용하는 클래스
		Calendar calendar = new GregorianCalendar();
		
		//Date보다 많은 정보를 출력
		System.out.println(calendar);
		
		//특정한 데이터를 조회 - 년도
		System.out.println(calendar.get(Calendar.YEAR));
		
		//최근 많이 사용하는 타입
		LocalDateTime meetingTime = LocalDateTime.of(2022, 10, 26, 18, 50);
		System.out.println(meetingTime);
		
		
		
		
		
	}
}
