import java.util.Calendar;

public class Ex09_Calendar {
	public static void main(String[] args) {
//		Calendar cal = new Calendar(); // error
		
		// 객체 생성
		Calendar cal = Calendar.getInstance(); // new를 사용하지 않음
		System.out.println("cal: " + cal);
		System.out.print("오늘 날짜는 ");
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "년 ");
		
		int month = cal.get(Calendar.MONTH);
		System.out.print(month + 1 + "월 ");

		int date = cal.get(Calendar.DATE);
		System.out.print(date + "일 ");
		
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1:일 ~ 7:토
		String [] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.print(week[day] +  "요일");
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);


			
	}
}
