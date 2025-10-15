public class Ex01_if_else {
	public static void main(String[] args) {
		
		int num1=200, num2=200;
		/*
		if(조건) {
			조건이 참이면 실행될 문장1;
			조건이 참이면 실행될 문장2;
		}
		무조건 처리			
		*/
		if(num1 > num2) {
		System.out.println("num1이 더 크다");
		}
		if(num1 < num2 ) {
		System.out.println("num2가 더 크다");
		}
		System.out.println("무조건 출력");
		
		System.out.println("---------------------------");
		if(num1 > num2) {
		System.out.println("num1이 더 크다");
		}
		else if(num1 < num2 ) {
		System.out.println("num2가 더 크다");
		}
		else {
		System.out.println("num1과 num2가 같다");
		}
	}
}
