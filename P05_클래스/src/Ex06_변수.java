class Var{
	static int a; // static 변수
	int b; // 인스턴스 변수
	public void increment() {
		int c=0; // 지역변수는 초기화를 해야함
		a+=1;
		b+=1;
		c+=1;
		System.out.println("static 변수 a: " + a);
		System.out.println("인스턴스 변수 b: " + b);
		System.out.println("지역 변수 c: " + c);
	}
	
}
public class Ex06_변수 {
	public static void main(String[] args) {
		System.out.println("객체 1 생성");
		Var v1 = new Var();
		v1.increment();

		System.out.println("객체 2 생성");
		Var v2 = new Var();
		v2.increment();

		System.out.println("객체 3 생성");
		Var v3 = new Var();
		v3
		.increment();
		
		System.out.println("객체 4 생성");
		Var v4 = new Var();
		v4.increment();
	}
}
