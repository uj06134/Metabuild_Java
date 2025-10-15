import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Company{
	private String part;
	private String position;
	private int grade;
	
	public Company(String part, String position, int grade) {
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
	
	public String toString() {
		return part + "/" + position + "/" + grade;
	}
}
// 이름은 key
// 부서, 직급, 평점은 Company로 value
public class Ex14_task_company {
	public static void main(String[] args) {
		Map<String, Company> company = new HashMap<String, Company>();
		Set<String> ks = company.keySet();
		String name;
		String part;
		String position;
		String question;
		boolean nameFind;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("이름: ");
			name = sc.next();
			
			System.out.print("부서: ");
			part = sc.next();
			
			System.out.print("직급: ");
			position = sc.next();
			
			System.out.print("평점: ");
			int grade = sc.nextInt();
			
			Company c = new Company(part, position, grade);
			company.put(name, c);
			
			System.out.print("계속? ");
			question = sc.next();
			
			if (question.equals("q")) {
				continue;
			}
			else if(question.equals("n")) {
				System.out.println(company);
				break;
			}
		}
		while (true) {
			nameFind = false;
			System.out.print("찾는 이름: ");
			name = sc.next();
			
			for (String s : ks) {
	            if(name.equals(s)) {
	            	System.out.println(company.get(s));
	            	nameFind = true;
	            	break;
	            }
	        }
			
			if (nameFind == false) {
				System.out.println("찾는 이름 없음");
			
			}
			
			System.out.print("계속? ");
			question = sc.next();
			
			if (question.equals("q")) {
				continue;
			}
			else if(question.equals("n")) {
				break;
			}
			
		}
		while (true) {
			nameFind = false;
			System.out.print("삭제할 이름: ");
			name = sc.next();
			for (String s : ks) {
	            if(name.equals(s)) {
	            	company.remove(name);
					System.out.println(company);
	            	nameFind = true;
	            	continue;
	            }
			}
			if (nameFind == false) {
				System.out.println("찾는 이름 없음");
				}
			
			System.out.print("계속? ");
			question = sc.next();
			
			if (question.equals("q")) {
				continue;
			}
			else if(question.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");

	}
}