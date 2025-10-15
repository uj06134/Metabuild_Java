public class Ex01_null {
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		try {
			String s = "자바";
			System.out.println(s);
			System.out.println(s.length()); // NullPointerException(에러 이벤트 변수)
			// 에러가 발생하면 이러와 관련된 객체가 자동으로 만들어진다.
			// 객체를 가지고 catch로 넘어온다.
			int[] arr = {10,20};
			System.out.println(arr[1]); // ArrayIndexOutOfBoundsException
			
			int result = 3/0; // ArithmeticException
			System.out.println(result); 
			
		// try에서 발생한 예외가 많아도 첫번째 예외만 잡을 수 있음
		} catch(NullPointerException e){
			System.out.println("NullPointerException 예외 발생");
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
			
		} catch(ArithmeticException e){
			System.out.println("ArithmeticException 예외 발생");
		
		// 예외 발생 여부에 관계없이 최종적으로 무조건 처리해야 하는 작업
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("main 끝");
	}
}
