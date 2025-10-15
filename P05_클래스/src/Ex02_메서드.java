public class Ex02_메서드 {
	public static void main(String[] args) {//main 메서드 정의
		System.out.println(1);
		star();	//메서드 호출	
		System.out.println(2);
		star();
		System.out.println(3);
		
		int result = add(10,20);//10,20: 전달인자
		System.out.println("메서드 리턴 값: " + result);
		
		int result2 = sub(40,10,7);
		System.out.println("메서드 리턴 값: " + result2);
	}
	public static void star() {//star 메서드 정의
		//리턴 타입이 void면 리턴값이 없다.
		System.out.println("☆");
		System.out.println("★");
	}
	public static int add(int a, int b) {//int a, int b: 매개변수
		int sum = a + b;
		return sum;
	}
	public static int sub(int x, int y, int z) {
		int result = x - y - z;
		return result;
	}
}
