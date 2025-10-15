/*
1. 메서드1로 단을 넘기면 해당 단의 구구단 출력하기
2. 메서드2로 문자열과 숫자를 넘기면 숫자갯수만큼 문자열 출력하기("apple",3)
3. 메서드3으로 두 숫자를 넘기면 두 숫자의 평균을 리턴해서 출력하기
*/
public class Ex03_메서드_김훈종 {
	public static void main(String[] args) {
		gugudanPrint(2);
		stringPrint("apple", 3);
		double result = avgPrint(1,2);
		System.out.println("메서드 리턴 값: " + result);
	}
	
	//메서드 1
	public static void gugudanPrint(int n) {
		int m;
		for(m=1;m<=9;m+=1) {
			System.out.println(n + "*" + m + "=" + n*m);
		}
	}
	//메서드 2
	public static void stringPrint(String word, int count) {
		int i;
		for(i=1;i<=count;i+=1) {
			System.out.println(word);
		}	
	}
	//메서드 3
	public static double avgPrint(int x, int y) {
		double result = (double)(x + y)/2;
		return result;
	}
}

