import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex12_HashMap {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<String, String>();
		dic.put("apple", "사과");
		dic.put("sky", "하늘");
		dic.put("eye", "눈");
		dic.put("car", "자동차");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾는 단어는?");
			String word = sc.next();
			if (word.equals("q")) {
				break;
			}
			else if (dic.containsKey(word)) {
				String meaning = dic.get(word);
				System.out.println("뜻: " + meaning);
			
			}
			else {
				System.out.println("잘못입력");
			}
		}
		System.out.println("프로그램을 종료");
	}
}
