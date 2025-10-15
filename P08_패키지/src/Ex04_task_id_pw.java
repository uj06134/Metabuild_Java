import java.util.Scanner;

class Person{
	private String id;
	private String pw;
	private String name;

	public Person(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
public class Ex04_task_id_pw {
	public static void main(String[] args) {
		Person [] arr = {
				new Person("kim", "1111", "김연아"),
				new Person("park", "2222", "박지성"),
				new Person("son", "3333", "손흥민")
		};

		Scanner sc = new Scanner(System.in);
		// 반복문 시작
		while(true) {

			// 아이디 입력
			System.out.print("id 입력:");
			String id = sc.next();

			// 아이디 길이 검증
			if (id.length() < 3 || id.length() > 8) {
				System.out.println("3글자~8글자 입력해야 합니다.");
				continue;
			}
			// 아이디 검증
			int i;
			for (i=0;i<arr.length;i+=1) {
				//				System.out.println(arr[i].getId());
				if (arr[i].getId().equals(id)) {
					break;
				}
			}

			// 아이디를 배열에서 끝까지 찾지 못했을 때 다시 아이디 입력
			if (i == arr.length) { 
				System.out.println("찾는 아이디가 없습니다.");
				continue;
			}

			// 비밀번호 입력
			System.out.print("pw 입력:");
			String pw = sc.next();

			// 비밀번호 검증 및 프로그램 종료 여부
			if (arr[i].getPw().equals(pw)) {
				System.out.println(arr[i].getName() + "님 반갑습니다.");
				System.out.print("계속?(y/n):");
				String answer = sc.next();
				if (answer.equals("n")) {
					break;
				}
				else if (answer.equals("y")) {
					continue;
				}
			}
			else {
				System.out.println("비번이 맞지 않습니다.");
				continue;
			}
		}
		// 반목문 탈출
		System.out.println("프로그램을 종료합니다.");

	}
}