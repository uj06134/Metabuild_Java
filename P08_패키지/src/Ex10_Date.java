import java.util.Date;
import java.util.Scanner;

public class Ex10_Date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.getYear() + 1900 + "년"); // 1900년도부터 시작
		System.out.println(now.getMonth() + 1 + "월"); // 0월부터 시작
		System.out.println(now.getDate() + "일");
		String [] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(week[now.getDay()] + "요일"); // 0:일 7:토
		System.out.println(now.getHours() + '시');
	}
}
