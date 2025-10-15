import java.util.Scanner;

public class Ex08_재귀호출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		int result = recursive(num1, num2); // 메서드 호출
		System.out.println(result);
	}
	public static int recursive(int num1, int num2) {
		if(num2==0) {
			return 1;
		}
		else {
			return num1 * recursive(num1, num2-1);

		}
	}
}
