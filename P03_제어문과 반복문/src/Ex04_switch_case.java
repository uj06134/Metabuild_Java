import java.util.Scanner;

public class Ex04_switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		/*
		switch (변수 또는 수식) {
		case 값1: 
		case 값2:
		default:
		}
		*/
		
		switch(num) {
			case 1: System.out.println("1입니다");
				break;
			case 2: System.out.println("2입니다");
				break;
			case 3: System.out.println("3입니다");
			default: System.out.println("그 밖의 숫자");
		}
	}
}
