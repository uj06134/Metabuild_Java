public class Ex05_Wrapper {
	public static void main(String[] args) {
		// 래퍼클래스: 기본형 데이터를 객체로 만들기 위해 Integer라는 클래스 사용
		Integer it1 = new Integer(11);
		Integer it2 = 22; // 22=>new Integer(22): autoboxing
		System.out.println(it1 + it2);
		
		int it3 = new Integer(21); // new Integer(22): unboxing
		double d = new Double(1.3);
		
		// parseInt(): 문자열을 정수로 바꿔주는 메서드
//		int i = Integer.parseInt("100");
//		int j = Integer.parseInt("200");
		Integer i = Integer.valueOf("100");
		Integer j = Integer.valueOf("200");
		
		System.out.println("100" + "200");
		System.out.println(i + j);
		
		// parseDouble(): 문자열을 실수로 바꿔주는 메서드
		Double x = Double.parseDouble("1.234");
		Double y = Double.parseDouble("2.345");
		System.out.println(x + y);
	}
}
