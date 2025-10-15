public class Ex02_정수형 {
	public static void main(String[] args) {
		System.out.println("10+20");
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		System.out.println(10/20);
		System.out.println("1+12+123+1234=" + 1+12+123+1234); //""뒤에 +는 연결을 의미
		System.out.println("1+12+123+1234=" + (1+12+123+1234)); //()로 우선순위 지정
		
		//a변수는 정수(integer)담는 용도로 사용 -> 선언
		int a; //int: -21억 ~ 21억
		long b; //long: -900경 ~ 900경
		//변수에 값을 넣었다 -> 초기화
		a = 10; 
		b = 20000000000000000l; 
		//선언과 동시에 초기화
		int c =30;
		
		System.out.println(a+c);
//		System.out.println(a+d); d cannot be resolved to a variable
		System.out.println("a+b=" + (a+b));
		
		
	}
}