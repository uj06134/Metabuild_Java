class Student{
	private int hakbun;
	private String name;
	
	public Student(int hakbun, String name) {
		super();
		this.hakbun = hakbun;
		this.name = name;
	}
	
	public int getHakbun(){ // getter 메서드
		return hakbun;
	}
	
	public String getName(){
		return name;
	}
	
	// 부모의 toString을 오버라이딩
	public String toString() {
		return hakbun +  ", " + name;
	}
	
	// 부모의 equals를 오버라이딩
	public boolean equals(Object obj) { // Student this = 100번지, Object obj = 200번지
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return this.hakbun == s.hakbun && this.name.equals(s.name);
		}
		else {
			return false;
		}
		
	}
}


public class Ex01_Object {
	public static void main(String[] args) {
		Student s1 = new Student(2020, "아이유"); // s1 = 100번지
		Student s2 = new Student(2023, "수지"); // s2 = 200번지
		System.out.println(s1.getHakbun());
		System.out.println(s2.getName());
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		String a = s1.toString();
		System.out.println(s1); // 참조변수 == 참조변수.toString()
		
		// equals(Object obj): 주소 비교하는 메서드
		boolean x = s1.equals(s2);
		System.out.println(x);
	}
}
