import java.util.StringTokenizer;

public class Ex08_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("2025/08|22,10:57","/|:,"); // 구분자 지정을 생략하면 공백이나 탭이 기본 구분자로 사용
		System.out.println(str);
//		System.out.println(str.toString());
		
		int count = str.countTokens();
		System.out.println(count);
		
		// StringTokenizer 클래스 객체에서 다음에 읽어 들일 token이 있으면 true, 없으면 false를 return한다.
		while(str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
		System.out.println("---------------------");
		String[] str2 = {"웬디:70","아이유:90","최강창민:80"};
		int i, sum=0;
		for(i=0;i<str2.length;i+=1) {
			StringTokenizer s = new StringTokenizer(str2[i],":");
			while (s.hasMoreTokens()) {
				s.nextToken(); // 웬디 아이유 최강창민
				String token2 = s.nextToken(); // 70 90 80
				sum += Integer.parseInt(token2);
				System.out.println(token2);
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("---------------------");
		
		// split()
		sum=0;
		for(i=0;i<str2.length;i+=1) {
			String[] split = str2[i].split(":");
			sum += Integer.parseInt(split[1]);	
		}
		System.out.println("합계: " + sum);
	
	}
}
