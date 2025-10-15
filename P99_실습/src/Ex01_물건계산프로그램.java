/*
 [문제] 물건 구매 계산 프로그램

 Scanner를 사용하여 사용자가 구입할 물건의 이름, 가격, 수량을 입력받아
 총 금액, 부가세(10%), 최종 결제 금액을 계산하여 출력하는 프로그램을 작성하시오.

 [입력]
 1) 물건 이름 (문자열)
 2) 물건 가격 (정수, 원 단위)
 3) 수량 (정수)

 [처리]
 - 총 금액 = 가격 × 수량
 - 부가세 = 총 금액 × 0.1
 - 최종 결제 금액 = 총 금액 + 부가세

 [출력 예시]
 상품명 : 키보드
 단가 : 15000원, 수량 : 2개
 총 금액 : 30000원
 부가세 : 3000원
 최종 결제 금액 : 33000원

 [힌트]
 - 문자열 입력 : nextLine() 사용
 - 금액 계산 시 정수/실수 변환에 주의
 - printf를 사용하여 원 단위 포맷 출력 가능
 */
import java.util.Scanner;
public class Ex01_물건계산프로그램 {
	public static void main(String[] args) {
		// 변수 선언
		String name;
		int price, count;

		// Scanner 생성
		Scanner sc = new Scanner(System.in);

		// 입력받기
		System.out.print("물건 이름: ");
		name = sc.nextLine();
		System.out.print("물건 가격: ");
		price = sc.nextInt();
		System.out.print("수량: ");
		count = sc.nextInt();

		// 변수 선언
		int total = price * count;
		double vat = price * count * 0.1;

		// 출력
		System.out.println("상품명:" + name);
		System.out.println("단가: " + price + ", 수량: " + count + "개");
		System.out.println("총 금액: " + total + "원");
		System.out.printf("부가세: %.0f원\n", vat);
		System.out.printf("최종 결제 금액: %d원", total + (int)vat);
	}
}