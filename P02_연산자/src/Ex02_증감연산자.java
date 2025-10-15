
public class Ex02_증감연산자 {
	public static void main(String[] args) {
		int a=10;
		//a = a+3;
		a += 3;
		System.out.println("a:" + a);
		
		int x=5, y=5, q, r;
		System.out.println("x:" + x);
		x = x + 1;
//		x += 1;
//		x++;
//		++ x;
		System.out.println("x:" + x);
		
		System.out.println("y:" + y);
		y = y - 1;
//		y -= 1;
//		y--;
//		-- y;
		System.out.println("y:" + y);
//----------------------------------------------
		x=5;
		y=5;
		q = ++x; //변수 앞++: 먼저 증가
//		q = x++; //변수 뒤++: 나중에 증가
		
		System.out.println("x:" + x);
		System.out.println("q:" + q);
		
		r = --y;
//		r = y--;  
		
		System.out.println("r:" + r); 
		System.out.println("y:" + y);
		
	}
}
