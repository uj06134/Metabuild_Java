import java.util.Scanner;

public class Ex10_while {
	public static void main(String[] args) {
		/*
		while(조건) {
			조건이 참이면 실행할 문장
		}	
		*/	
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i+=1;
		}
		System.out.println("--------------------");

		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자입력: ");
			num = sc.nextInt();
			
			if(num<0) {
				break;
			}
		}
	}
}
