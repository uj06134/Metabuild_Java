class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Person3 extends Animal{
	public void move() {
		System.out.println("사람이 걷는다.");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("새가 날아간다.");
	}
}
public class Ex07_다형성 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		Person3 p = new Person3();
		p.move();
		Bird b = new Bird();
		b.move();
		
		System.out.println("----------------");
		
		double i = 3; //(double)3: 자동형변환
//		System.out.println(i);
		
		// 다형성: 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것
		Animal p2 = new Person3(); // (Animal)new Person3 업캐스팅(upcasting): 자식을 부모 타입으로 자동 변경
		p2.move();
		Animal b2 = new Bird();
		b2.move();
	}
}
