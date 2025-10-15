import java.util.Scanner;

public class Ex05_switch_case {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//입력 및 선언
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		
		//선언
		int total = kor + eng + math;
		double mean = (double)total / 3;
		
		//출력
		System.out.println("------------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math);
		System.out.println("------------------------------");
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", mean);
		
		//조건문
		// 점수를 학점 코드로 변환
		int gradeCode = (int)mean / 10; // 90~99 → 9, 80~89 → 8, ...

		switch (gradeCode) {
		    case 10: // 100점
		    case 9:
		        System.out.println("학점: A");
		        break;
		    case 8:
		        System.out.println("학점: B");
		        break;
		    case 7:
		        System.out.println("학점: C");
		        break;
		    case 6:
		        System.out.println("학점: D");
		        break;
		    default:
		        System.out.println("학점: F");
		}
	}
}
