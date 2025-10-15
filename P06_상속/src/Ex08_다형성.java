class Car{
	String color = "white";
	int door = 4;

	void drive() {
		System.out.println("drive");
	}

	void stop() {
		System.out.println("stop");
	}
}
class FireEngine extends Car{
	int door = 6;
	int wheel = 10;
	public void drive() {
		System.out.println("FEdrive");
	}
	
	void water() {
		System.out.println("water");
	}
}
public class Ex08_다형성 {
	public static void main(String[] args) {
		Car c;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		fe.drive();
		c = fe; // c = (Car)fe; : 업캐스팅
		System.out.println(c.door);
//		System.out.println(c.wheel); 부모가 물려준 변수에만 접근 가능
		System.out.println(c.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		System.out.println("----------------");
		c.drive(); // 부모가 drive를 갖고있는지 확인되면 자식의 drive 출력
		System.out.println("----------------");
		if (c instanceof FireEngine) {
			System.out.println("다운 캐스팅 가능"); // 업캐스팅이 먼저 되어야만 다운 캐스팅이 가능
		}
		else {
			System.out.println("다운 캐스팅 불가능");
		}
		fe2 = (FireEngine)c; // 다운캐스팅: 부모를 자식타입으로 내리는 작업
		fe2.water();
		fe2.drive();	
	}
}
