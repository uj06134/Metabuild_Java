import java.util.Scanner;
public class Ex02_Exception {
	public static void main(String[] args) {
		// 1~100 정수 난수 발생
		int answer = (int)(Math.random()*100)+1;
		System.out.println(answer);
		
////		32~56 정수 난수
//		int d = (int)(Math.random()*25)+32;
//		System.out.println(d);
		
		// while문으로 입력 받기
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = 0;
		do {
			count+=1;
			System.out.print("숫자입력: ");
			// 문자 예외처리
			try {
				num = sc.nextInt(); // InputMismatchException
			}
			// Exception e = new InputMismatchException
			catch(Exception e){
				System.out.println("다시 입력하세요");
				sc.next();
				continue;
			}
			
			if(answer>num) {
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(answer<num) {
				System.out.println("더 작은 수를 입력하세요");
			}
			else {
				System.out.println("정답입니다");
				System.out.println("시도한 횟수는 " + count + "번 입니다");
				break;
			}
		}while(true);
		
	}
}
