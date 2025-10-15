class Parent{
	int x=10; // 부모 인스턴스 변수 - 우선순위 3
	void method() {
		System.out.println("P_x: " + x);
	}
}
class Child extends Parent{
	int x=20; // 자식 인스턴스 변수 - 우선순위 2
	void method() {
		int x=30; // 지역 변수 - 우선순위1
		System.out.println("x: " + x);
		System.out.println("C_x: " + this.x);
		System.out.println("P_x: " + super.x);
	}
}

public class Ex02_super {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method();
		Child c = new Child();
		c.method();
	}
}
