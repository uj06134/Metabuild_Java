class Member{
	private String id;
	private String password;
	
	// 생성자: 클래스와 이름이 똑같은 메서드
	// 생성자 오버로딩
	public Member() { //생성자는 리턴값도 없고 void도 쓰지 않는다.
		System.out.println("Member 생성자1");
		this.id = "park";
		this.password = "9876";
	}
	
	public Member(String id, String password){
		System.out.println("Member 생성자2");
		this.id = id;
		this.password = password;

	}
	public Member(String id) {
		System.out.println("Member 생성자3");
		this.id = id;
		this.password = "1234";
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void display() {
		System.out.println(id + ", " + password);
	}
}
public class Ex13_생성자 {
	public static void main(String[] args) {
		Member m = new Member();
		
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		System.out.println("----------------------------");
		
		Member m2 = new Member("hong", "3333");
		System.out.println(m2.getId());
		System.out.println(m2.getPassword());
		m2.display();
		System.out.println("----------------------------");

		Member m3 = new Member("jung");
		System.out.println(m3.getId());
		System.out.println(m3.getPassword());
		
	}
}
