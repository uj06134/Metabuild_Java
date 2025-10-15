class Person{
	String name;
	int age;
	double height;
	static String nation = "대한민국";	//static: 공용으로 사용
	final int x=10; // final은 초기화 필수
}

public class Ex01_클래스 {
	public static void main(String[] args) {
		Person man = new Person();//객체 생성
		System.out.println("man: " + man);
		System.out.println(man.x);
//		man.x = 20; //final 변수는 값 변경 불가(상수화)
		
		man.name = "홍길동";
		man.age = 27;
		man.height = 170.03;
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(man.nation);
		
		Person woman = new Person();//객체 생성
		System.out.println("woman: " + woman);
		woman.name = "홍길순";
		woman.age = 25;
		woman.height = 160.03;
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(woman.nation);

	}
}
