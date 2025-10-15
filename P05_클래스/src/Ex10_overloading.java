public class Ex10_overloading {
	public static void main(String[] args) {
		int sum1 = plus(1, 2);
		System.out.println(sum1);
		
		int sum2 = plus(1, 2, 3);
		System.out.println(sum2);
		
		double sum3 = plus(1.1, 2.2, 3.3, 4.4);
		System.out.println(sum3);
	}
	// 오버로딩: 하나의 메서드 이름으로 여러 개의 메서드를 만드는 것
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double plus(double a, double b, double c, double d) {
		return a + b + c + d;
	}
}
