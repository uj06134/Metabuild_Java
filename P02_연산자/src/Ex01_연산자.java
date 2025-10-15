import java.util.Scanner;

public class Ex01_연산자 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		num1 = sc.nextInt();
		System.out.print("정수2: ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		
		// 소수 3째자리까지 출력
		System.out.printf(num1 + "/" + num2 + "=" + "%.3f\n", (double)num1/num2);
		System.out.printf("%d/%d=%.3f\n",num1,num2,(double)num1/num2);
	}

}