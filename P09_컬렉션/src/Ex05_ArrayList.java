import java.util.ArrayList;
import java.util.Scanner;

class Member{
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

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
	
	// toString 메서드 오버라이딩
	public String toString() {
		return id + "/" + pw;
	}
	
}


public class Ex05_ArrayList {
	public static void main(String[] args) {
		Member m1 = new Member("kim", "1111");
		Member m2 = new Member("lee", "2222");
		Member m3 = new Member("park", "3333");

		ArrayList<Member> al = new ArrayList<Member>();
		al.add(m1);
		al.add(m2);
		al.add(new Member("park", "3333"));
		
		// toString 호출
		System.out.println(al);
		
		// id pw
		Scanner sc = new Scanner(System.in);
		String id,pw,retry;
		int i;
		boolean idFind = false;
		while(true) {
			System.out.print("id입력:");
			id=sc.next();
			System.out.print("pw입력:");
			pw=sc.next();
			
			Member m = new Member(id,pw);
			al.add(m);
			
			System.out.print("계속?(y/n):");
			retry = sc.next();
			if(retry.equals("n")){
				break;
			}
		}
		System.out.println(al);
		System.out.print("삭제할 아이디 입력:");
		id = sc.next();
		for(i=0;i<al.size();i+=1) {
			Member m = al.get(i);
			if(m.getId().equals(id)) {
				al.remove(i);
				System.out.println("삭제되었습니다");
				idFind = true;
			}
		}
		if(idFind == false){
			System.out.println("못찾았습니다");
		}
		System.out.println(al);
	}
}
