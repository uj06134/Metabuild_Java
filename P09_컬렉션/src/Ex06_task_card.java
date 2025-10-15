/*
1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 아이유
전화번호를 입력하세요 : 1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 박보검
전화번호를 입력하세요 : 3223

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234
박보검		3223

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 박보검
삭제되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 웬디
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 아이유
수정하실 전화번호는 : 9876
수정되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		9876

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 슬기
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:6
잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
프로그램을 종료합니다.
*/
import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

public class Ex06_task_card {
	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		boolean nameFind;
		int i;
		int menu;
		while(true) {
			nameFind = false;
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료: ");
			menu = sc.nextInt();
			switch(menu) {
			
			// 1. 명함추가
			case 1:
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				System.out.print("전화번호를 입력하세요: ");
				tel = sc.next();
				Card c = new Card(name, tel);
				list.add(c);
				break;
			
			// 2. 명함삭제
			case 2:
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				for(i=0;i<list.size();i+=1) {
					Card c2 = list.get(i);
					if(c2.getName().equals(name)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						nameFind = true;
					}
				}
				if(nameFind == false) {
					System.out.println("이름을 잘못입력하셨습니다.");
				}
				break;
				
			// 3. 명함 수정	
			case 3:
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				for(i=0;i<list.size();i+=1) {
					Card c3 = list.get(i);
					if(c3.getName().equals(name)) {
						System.out.print("수정하실 전화번호는: ");
						String change_tel = sc.next();
						c3.setTel(change_tel);
						System.out.println("수정되었습니다");
						nameFind = true;	
					}
					break;
				}
				if(nameFind == false) {
					System.out.println("이름을 잘못입력하셨습니다.");
				}
				break;
				
			// 4. 명함보기
			case 4:
				System.out.println("이름\t\t전화번호");
				for(i=0;i<list.size();i+=1) {
					Card c4 = list.get(i);
					System.out.println(c4.getName() + "\t\t" + c4.getTel());
				}
//				// 확장 for문
//				for(Card c4: list) {
//					System.out.println(c4.getName() + "\t\t" + c4.getTel());
//				}
				break;
				
			// 5. 종료	
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;

			// 1~5 이외의 값
			default: 
	            System.out.println("잘못입력하셨습니다.");
			} //switch-case 끝
		} // while 끝
	}
}