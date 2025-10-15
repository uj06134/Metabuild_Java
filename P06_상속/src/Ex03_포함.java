class Person{
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student{
	int kor,eng,math;
	Person p; // 포함
	
	public Student(String name, int age, int kor, int eng, int math){
		p = new Person(name, age);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void display() {
		System.out.println("name:" + p.name);
		System.out.println("age:" + p.age);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
	}
}

public class Ex03_포함 {
	public static void main(String[] args) {
		Student s = new Student("kim", 20, 70, 80, 90);
		s.display();
	}
}
