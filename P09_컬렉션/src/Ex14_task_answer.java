import java.util.HashMap;
import java.util.Scanner;

class Company2{
	private String part;
	private String position;
	private int grade;
	public Company2() {
		
	}
	public Company2(String part, String position, int grade) {
		super();
		this.part = part;
		this.position = position;
		this.grade = grade;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		//return "Company2 [part=" + part + ", position=" + position + ", grade=" + grade + "]";
		return part+","+position+","+grade;
	}
	
}

public class Ex14_task_answer {
	public static void main(String[] args) {
		HashMap<String,Company2> hm = new HashMap<String,Company2>();
		
		Scanner sc = new Scanner(System.in);
		String name,part,position,retry;
		int grade;
		
		while(true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("부서 : ");
			part = sc.next();
			System.out.print("직급 : ");
			position = sc.next();
			System.out.print("평점 : ");
			grade = sc.nextInt();
			Company2 com = new Company2(part,position,grade);
			hm.put(name, com);
			System.out.print("계속? : ");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		} // 입력해서 hashmap에 넣는작업
		
		System.out.println(hm);
		
		while(true) { // 이름 검색 반복
			System.out.print("찾는 이름:");
			name = sc.next();
			if(hm.get(name) == null) {
				System.out.println("찾는 이름 없음");
			}else {
				System.out.println(hm.get(name));
			}
			
			System.out.print("계속? : ");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		// 
		
		while(true) { // 삭제 반복
			System.out.print("삭제할 이름:");
			name = sc.next();
			
			if(hm.get(name) == null) {
				System.out.println("찾는 이름 없음");
			}else {
				hm.remove(name);
				System.out.println(hm);
			}
			
			System.out.print("계속? : ");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
/*
이름 : kim
부서 : 연구부
직급 : 대리
평점 : 7
계속?y

이름 : park
부서 : 인사부
직급 : 과장
평점 : 6
계속?n
{kim=연구부/대리/7, park=인사부/과장/6}

찾는 이름:hong
찾는 이름 없음
계속?y

찾는 이름:park
인사부/과장/6
계속?n
삭제할  이름:jung
찾는 이름 없음

계속?y
삭제할  이름:park
{kim=연구부/대리/7}

계속?n
프로그램을 종료합니다.
*/
