class Test{
	int x=10;
	void display() {
		System.out.println("Test x:" + x);
	}
}
class Test2 extends Test{
	void display() {
		System.out.println("Test x:" + x*x);
	}
}

public class Ex14_익명클래스 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
		
		Test2 t2 = new Test2();
		t2.display();
		
		// 익명클래스: 클래스를 새로 만들지 않고도 display 메서드를 새로 완성
		new Test() {
			void display() {
				System.out.println("Test x:" + x*x*x);
			}
		}.display();
	}
}
