public class Ex04_삼항 {
	public static void main(String[] args) {
		//조건 ? 조건이 참일 때 : 조건이 거짓일 때 -> 조건(삼항) 연산자
		int x = 10, y = 20;
		int result = x>y ? x : y;
		System.out.println("reuslt: " + result);
		
		String result2 = x % 2 == 0 ? "짝수" : "홀수";
		System.out.println("reuslt2: " + result2);

	}

}
