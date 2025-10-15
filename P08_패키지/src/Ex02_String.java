import java.util.Scanner;

//import java.lang.String;

public class Ex02_String {
	public static void main(String[] args) {
		
//		String s1 = new String("Have a nice day");
//		String s2 = new String("Have a nice day");
		
		// 주소비교 뺴고는 위와 동일
		String s1 = "Have a nice day";
		String s2 = "Have a nice Day";
		
		System.out.println("s1: " + s1);
		System.out.println("s1: " + s1.toString());
		System.out.println("s2: " + s2);
		
		int len = s1.length(); // String에 메서드를 호출
		System.out.println("len: " + len);
		
		// 주소 비교
		boolean e2 = s1 == s2;
		System.out.println("==: " + e2);

		// 문자열 비교
		boolean e = s1.equals(s2);
		System.out.println("equals: " + e);
		
		if (e==true) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
				
		// 대소문자 무시
		e = s1.equalsIgnoreCase(s2);
		System.out.println("equalsIgnoreCase: " + e);
		
		if (e==true) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
		
		// 아스키 코드
		// a:97 d:100
		// A:65 d:68
		// compareTo(String): 같으면 0 같지 않으면 다른 정수값이 나옴
		 int compareTo = s1.compareTo(s2); // d(100) - D(68)
		 System.out.println("compareTo: " + compareTo);
		 
		 if (compareTo == 0) {
				System.out.println("두 문자열 같음");
			}
		 else {
				System.out.println("두 문자열 같지 않음");
			}
		 
		 // 대소문자 무시
		 int compareToIgnoreCase = s1.compareToIgnoreCase(s2);
		 System.out.println("compareTo: " + compareToIgnoreCase);
		 
		 if (compareToIgnoreCase == 0) {
				System.out.println("두 문자열 같음");
			}
		 else {
				System.out.println("두 문자열 같지 않음");
			}
		 
		 // concat(): 문자열 연결
		 String concat = s1.concat("!");
		 System.out.println(concat);
		 
		 // indexOf(): 문자열의 위치를 구하기 (0부터 시작) / 없으면 -1
		 int indexOf = s1.indexOf("a");
		 System.out.println("indexOf: " + indexOf);
		 
		 // lastIndexOf(): 뒤에서부터 문자열의 위치를 구하기
		 int lastIndexOf = s1.lastIndexOf("a");
		 System.out.println("lastIndexOf: " + lastIndexOf);
		 
		 
		 String s3 = " a b c   d   E  F ";
		 System.out.println(s3.length());
		 
		 // trim(): 앞과 뒤의 공백을 없애기
		 String trim = s3.trim();
		 System.out.println(trim.length());
		 
		 // toUpperCase(): 대문자로 바꾸기
		 String toUpperCase = s3.toUpperCase();
		 System.out.println("toUpperCase:" + toUpperCase);
		 
		 // toLowerCase(): 소문자로 바꾸기
		 String toLowerCase = s3.toLowerCase();
		 System.out.println("toLowerCase:" + toLowerCase);
		 
		 // contains(): 포함 여부 확인
		 boolean contains = s1.contains("nice");
		 System.out.println("contains: " + contains);
		 if (contains == true) {
			 System.out.println("nice 포함");		 
		 }
		 else {
			 System.out.println("nice 미포함");	
		 }
		 
		 // charAt(n): n번쨰 위치한 문자 출력
		 char charAt = s1.charAt(3);
		 System.out.println(charAt);
		 
		 // substring(n): n번째부터 끝까지 출력 
		 String substring1 = s1.substring(5);
		 System.out.println("substring1: " + substring1);
		 
		 // substring(n, m): n번째부터 m앞에있는거까지 출력 
		 String substring2 = s1.substring(5, 9);
		 System.out.println("substring2: " + substring2);
		 
		 System.out.println("-------------");
		 // .의 위치: 5 1 2
		 // fileName: 0~<5 0~<1
		 // ext: 5~, 1~, 2~
		 
		 String fullName = "Hello.java"; // a.txt bc.df
		 int i = fullName.indexOf('.'); // '.': .의 아스키코드 값이 들어감 
//		 System.out.println(i);
		 
		 String fileName =  fullName.substring(0, i);
		 String ext =  fullName.substring(i+1);
		 
		 System.out.println("파일명: " + fileName);
		 System.out.println("확장자: " + ext);
		 
		 // ID, PW 입력받아서 일치하면 가입한 회원입니다. 일치하지 않으면 가입하지 않았습니다
		 
		 String id = "kim", pw = "1234";
		 String loginId, loginPw;
 		 Scanner sc = new Scanner(System.in);
		 System.out.print("아이디 입력: ");
		 loginId = sc.next();
		 System.out.print("비밀번호 입력: ");
		 loginPw = sc.next();

		 if(id.equals(loginId) && pw.equals(loginPw)){
			 System.out.println("가입한 회원입니다.");
		 }
		 else {
			 System.out.println("가입하지 않았습니다.");
		 }
		 
		 
		 
	}
}
