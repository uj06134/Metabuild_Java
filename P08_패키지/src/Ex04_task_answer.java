import java.util.Scanner;

class Person2 {
	private String id;
	private String pw;
	private String name;

	public Person2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	// getter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}
	// Setter getter쉽게 만들기
	// Source ==> Generater Getters and Setter클릭
}


public class Ex04_task_answer {

	public static void main(String[] args) {
		Person2 p1 = new Person2("qqqq", "1111", "김");
		Person2 p2 = new Person2("wwww", "2222", "이");
		Person2 p3 = new Person2("eeee", "3333", "박");


		Person2[] arr = {p1, p2, p3};
		Scanner sc = new Scanner(System.in);
		String id, pw;
		String retry;
		boolean idFind = false, pwMatch = false; // ==> 아이디를 못찾을 경우 False, 찾을경우 ture로 입력하여 사용


		do {
			// 작셩순서2) 아이디
			System.out.println("id입력");
			id = sc.next();
			if(id.length() < 3 || id.length() > 8) {
				System.out.println("3글자 ~ 8글자 입력해야 합니다.");
				continue;
			}

			// 작성순서2) 아이디 비교 for문 작성, boolean변수 생성

			for(int i = 0; i<arr.length; i++) {
				if(arr[i].getId().equals(id)) { // arr배열에서 id를 찾는다면?
					idFind = true; // boolean 변수를 생성해서 true , false를 가져다쓴다. 찾았으므로 true로 입력					
				} // else를 쓰면 반복문만큼 
				// 찾는아이디가 없다고 i번 만큼 반복함

				// 작성순서3) for문 밖 if에 아이디를 못찾을 경우 작성
			}//for문을 다 돌고도 false ==> 아이디를 못찾는다면?
			if(idFind == false) {
				System.out.println("찾는 아이디 없습니다.");
				continue; // 찾는 아이디가 없을경우, do while에서는 조건식으로 감, 맨아래 while(true)로 이동
			}

			//작성순서5) 비밀번호 반복을 위한 do while
			do {
				// 작성순서4) 비밀번호 입력, 아이디 비교(for문)가 끝난 후 아래입력 
				System.out.println("pw입력 :");
				pw = sc.next();

				// 작성순서6) 비밀번호를 만약 잘못입력했을경우 else문의 무한true를 벗어나기 위해 false로 초기화해준다.
				pwMatch = false; 
				for(int i=0; i <arr.length; i++) { // 반복문을 배열만큼 돌면서 
					if(arr[i].getId().equals(id)){ // 배열 i의 아이디와 입력아이디가 같다면
						if(arr[i].getPw().equals(pw)) {
							System.out.println(arr[i].getName() + "님 반갑습니다.");

						}else {
							System.out.println("비밀번호가 맞지 않습니다.");
							pwMatch = true; // 맞지않으면 true로 변경하여 다시 do while(true)로 이동하여 반복시작										
						}	
					} //if
				}// for
				if(pwMatch == false) {
					break;
				}
			}while(true);


			// 작성순서1).이곳부터 작성해서 프로그램(반복)이 종료되는지 확인,
			System.out.println("계속? y/n");
			retry = sc.next();
			if(retry.equals("n")) {
				break;
			}
		}while(true);

		System.out.println("프로그램 종료");
	}

}

