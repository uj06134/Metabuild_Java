import java.util.Scanner;

public class Ex06_for {
	public static void main(String[] args) {
		/*
		for(초기식;조건식;증감식) {
			반복할 문장1;
			반복할 문장2;
		}
		*/
		int i;
		for(i=1; i<=5; i++) {
			System.out.println("Java" + i);
		}
		System.out.println("for문 밖" + i);
		System.out.println("-------------------------------");
		
//		1부터 10까지의 합계 출력하기
		int sum = 0;
		for(i=1; i<=10; i+=1) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합계: " + sum);
		System.out.println("-------------------------------");
		
//		1~100사이의 수 중에서 5의 배수이면서 7의 배수인수만 출력하기
		for(i=1; i<=100; i+=1) {
			if (i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------------------");
		
//		1~100사이의 수 중에서 짝수의 합, 홀수의 합 출력하기
		int even = 0;
		int odd = 0;
		
		for(i=1; i<=100; i+=1) {
			if (i%2==0) {
				even = even + i;
			}
			else {
				odd = odd + i;
			}
		}
		System.out.println("짝수의 합:" + even);
		System.out.println("홀수의 합:" + odd);
		System.out.println("-------------------------------");
		
//		숫자를 입력받아 구구단 출력하기
		Scanner sc = new Scanner (System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		for(i=1; i<=9; i+=1) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" + result);
		}
	}
}
