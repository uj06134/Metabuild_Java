import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		// 배열: 고정된 크기의 메모리를 갖음
		// 컬렉션: 동적으로 메모리 확장 가능
		// List: 순서가 있는 데이터 집합, 중복 허용
		ArrayList<String> al = new ArrayList<String>();
		int size = al.size();
		System.out.println(size);
		al.add("수영");
		al.add("윤아");
		al.add("태연");
		size = al.size();
		System.out.println(size);
		System.out.println(al);
		System.out.println(al.toString());

		Object obj = al.get(1);
		System.out.println(obj);
		
		al.add(1, "태연");
		System.out.println(al);
		
		al.indexOf(al);
		int index1 = al.indexOf("수영");
		System.out.println(index1);
		
		int index2 = al.lastIndexOf("수영");
		System.out.println(index2);
		
		boolean contains = al.contains("수영");
		System.out.println(contains);
		System.out.println("-----------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
//		if(al.indexOf(name) != -1) {
//			System.out.println("가입한 회원입니다");
//		}
//		else {
//			System.out.println("가입하지 않았습니다");
//		}
		if(al.contains(name) == true) {
			System.out.println("가입한 회원입니다");
		}
		else {
			System.out.println("가입하지 않았습니다");
		}
		System.out.println("-----------------");
//		al.remove(1);
		al.remove("수영");
		System.out.println(al);
		
		al.clear();
		System.out.println(al.size());
	}
}
