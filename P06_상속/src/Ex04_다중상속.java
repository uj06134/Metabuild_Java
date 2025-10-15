class Person2{
	private String name;
	private int age;

	public Person2() {
	}

	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void display(){
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}

class Worker extends Person2{
	//	private String name;
	//	private int age;
	private String company;
	private String part;

	public Worker(String name, int age, String company, String part) {
		super(name,age);
		this.company = company;
		this.part = part;
	}

	public void display() {
		super.display();
		System.out.println("company:" + company);
		System.out.println("part:" + part);
	}
}

class Teacher extends Worker{
	//	private String name;
	//	private int age;
	//	private String company;
	//	private String part;
	private String subject;

	public Teacher(String name, int age, String company, String part, String subject) {
		super(name,age,company,part);
		this.subject = subject;
	}
	
	public void display() {
		super.display();
		System.out.println("subject:" + subject);
	}
	
}

public class Ex04_다중상속 {
	public static void main(String[] args) {
		Person2 p = new Person2("제니", 30);
		//		p.display();

		Worker w = new Worker("지수", 40, "메타빌드", "연구부");
		//		w.display();

		Teacher t = new Teacher("로제", 50, "메타고", "생활지도부", "음악");
		t.display();

	}
}
