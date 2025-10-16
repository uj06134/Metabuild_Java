public class Ex04_문자형 {
	public static void main(String[] args) {
		char f1;
		f1 = 'A'; //작은 따옴표 둘러싼 한글자만 넣기 가능
		System.out.println("f1=" + f1);
		System.out.println(f1);
		System.out.println(f1+1); //A(char:2=>4)+1(int:4)
		System.out.println((char)66);
		System.out.println((char)f1 + 1);
		/*
		 아스키코드값
		 A:65
		 B:66
		 a:97
		 b:98
		 ...
		 */
	}
}
