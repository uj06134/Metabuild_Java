import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	Scanner sc = new Scanner(System.in);
	PersonDao pdao = new PersonDao();
	
	public PersonMain() {
		System.out.println("PersonMain 생성자");
		init();
	}
	
	private void init() {
		int menu;
		
		while(true){
			System.out.println("=== 메뉴 선택하기 ===");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 성별로 조회");
			System.out.println("3. 정보 수정");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 정보 추가");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> 메뉴 번호 입력: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				ArrayList<PersonBean> lists = pdao.getAllPerson();
				displayPerson(lists);
				break;
			case 2: 
				getPersonByGender();
				break;
			case 3: 
				updateData();
				break;
			case 4: 
				deleteData();
				break;
			case 5: 
				insertData();
				break;
			case 6: 
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
			
			default: 
				System.out.println("1~6번호만 입력 가능");
			} // switch
		} // while
	} 

	private void getBookBySearch() {
	System.out.println("제목:1   저자:2   출판사:3   버호입력>>");	
	}
	
	private void deleteData() {
		int num;
		System.out.print("번호 입력:"); // 조건
		num = sc.nextInt();
		pdao.deleteData(num);
	}

	private void updateData() {
		String name,gender,birth;
		int num, age;
		
		System.out.print("번호 입력:"); // 조건
		num = sc.nextInt();
		
		System.out.print("이름 입력:");
		name = sc.next();
		
		System.out.print("나이 입력:");
		age = sc.nextInt();
		
		System.out.print("성별 입력:");
		gender = sc.next();
		
		System.out.print("생년월일 입력:");
		birth = sc.next();
		
		pdao.updateData(num,name,age,gender,birth);
		
	}

	private void insertData() {
		String name,gender,birth;
		int age;
		
		System.out.println("번호는 시퀀스로 자동입력");
		System.out.print("이름 입력:");
		name = sc.next();
		
		System.out.print("나이 입력:");
		age = sc.nextInt();
		
		System.out.print("성별 입력:");
		gender = sc.next();
		
		System.out.print("생년월일 입력:");
		birth = sc.next();
		
		pdao.insertData(name,age,gender,birth);
	}

	private void getPersonByGender() {
		String gender;
		System.out.print("찾으려는 성별을 입력: ");
		gender = sc.next();
		ArrayList<PersonBean> lists = pdao.getPersonByGender(gender);
		displayPerson(lists);
	}
	
	public void displayPerson(ArrayList<PersonBean> lists) {
		System.out.println("번호\t이름\t나이\t성별\t생년월일");
		for (int i=0;i<lists.size();i+=1) {
			PersonBean pb = lists.get(i);
			System.out.println(pb.getNum() + "\t" + pb.getName() + "\t" + pb.getAge() + "\t" + pb.getGender() + "\t" + pb.getBirth());
		}
	}

	public static void main(String[] args) {
		new PersonMain();
	}
}
