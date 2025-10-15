public class Ex02_throw {
	public static void main(String[] args) {
		try{
			call();
			System.out.println("call메서드에서 정상 처리");
		} 
		catch(ArithmeticException e) {
			System.out.println("call메서드에서 예외 발생");
		}
	}
	
	public static void call() {
		try {
			int result = 3/0;
			System.out.println("연산 성공");	
		} 
		catch(ArithmeticException e){
			System.out.println("연산중 예외 발생");
			throw e; // 호출한 쪽으로 예외가 발생했다는 정보 전달
		}
	}
}
