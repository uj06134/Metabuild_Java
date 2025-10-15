interface RemoteControl2{
	void turnOn();
	void turnOff();
}

public class Ex16_익명클래스 {
	public static void main(String[] args) {
		// 익명클래스
		RemoteControl2 r = new RemoteControl2() {
			public void turnOn() {
				System.out.println("Tv켠다");
			}
			
			public void turnOff() {
				System.out.println("Tv끈다");
			}
		};
		
		r.turnOff();
		r.turnOn();
	}
}

