class Calculate{
	int x; //인스턴스 변수
	int y;
	static int z=0; //staic 변수	
	
	public int add(){ //인스턴스 메서드
		return x+y;
	}	
	public int multiply(){
		return x*y;
	}
	public int max() {
		if (x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	public static void star() { //static 메서드
		System.out.println("*****");
		System.out.println(z); //static 메서드 안에서는 static 변수만 사용 가능
//		System.out.println(x); //error
	}
}

public class Ex04_메서드 {
	public static void main(String[] args) {
		Calculate cal = new Calculate(); // 인스턴스(객체) 생성
		cal.x = 10;
		cal.y = 20;
		
		int resultAdd = cal.add();
		System.out.println(resultAdd);
		
		int resultMul = cal.multiply();
		System.out.println(resultMul);
		
		int maxNum = cal.max();
		System.out.println(maxNum);
		
		cal.star();
		Calculate.star(); //클래스 이름으로도 호출 가능
	}
}
