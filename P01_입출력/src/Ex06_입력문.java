import java.util.Scanner;

public class Ex06_입력문 {
	public static void main(String[] args) {
		int kor, eng, math;
//		kor = 70;
//		eng = 80;
//		math = 90;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		kor = sc.nextInt();
		System.out.print("영어점수:");
		eng = sc.nextInt();
		System.out.print("수학점수:");
		math = sc.nextInt();
//		System.out.println("합계: " + (kor + eng + math) + "점");
		
		int sum = kor + eng + math;
		System.out.println("합계: " + sum + "점");
		
		int avg = sum / 3;
		System.out.println("평균1: " + (avg) + "점");
		
		// 강제 형 변환
		double avg2 = (double)sum / 3;
		System.out.println("평균2: " + (avg2) + "점");
		
		double avg3 = sum / 3.0;
		System.out.println("평균3: " + (avg3) + "점");
		
		// printf: 형식을 지정해서 출력 가능(소수점 자리수, 폭, 정렬 등)
		System.out.printf("평균4: %.2f\n점", avg3);
		System.out.printf("국어:%d점, 영어:%d점, 수학%d\n점",kor, eng, math);
		
//		double: %f
//		int: %d
//		char: %c
		

		
		
		
	}
}
