class Robot{

}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춘다옹");
	}
} // DanceRobot

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래 한다옹");
	}
} // SingRobot

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림 그린다옹");
	}
} //DrawRobot


public class Ex09_다형성 {

	public static void main(String[] args) {
		Robot a = new DanceRobot();
		Robot b = new SingRobot();
		Robot c = new DrawRobot();

		Robot[] arr = {a, b, c};

		for(int i=0; i<arr.length; i+=1) {
			action(arr[i]); // static메서드 이므로 메서드에 static이 붙어야함.
		}
	}

	// for문으로 action 메서드에 배열을 받음
	public static void action(Robot r) { // static이 붙어야함 
		// 다른 객체지만 모두 Robot의 부모를 가져 세개를 메서드에 한번에 받을 수 있음.
		//i=0 : Robot = new DanceRobot()  // 댄스 로봇이 로봇타입으로 업캐스팅
		// 부모가 자식관리, 하지만 부모가 dance를 가지고 있지 않음
		// 따라서 다운캐스팅을 통해 자식의 dance메서드 호출
		//        DanceRobot a = (DanceRobot)r;
		//        a.dance();
		//
		//        SingRobot b = (SingRobot)r;
		//        b.sing();

		if (r instanceof DanceRobot) {
			DanceRobot a = (DanceRobot)r;
			a.dance();
		}else if(r instanceof SingRobot) {
			SingRobot b = (SingRobot)r;
			b.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot c = (DrawRobot)r;
			c.draw();
		}
	}
}