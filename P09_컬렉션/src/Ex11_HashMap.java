import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
// Map
// 키, 값 쌍으로 데이터 표현
// 키(key)는 중복허용x, 값(value)은 중복허용o
public class Ex11_HashMap {
	public static void main(String[] args) {
		// 다형성
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("웬디", 30); // 키, 값
		hm.put("슬기", 40); 
		hm.put("조이", 30); 
		hm.put("슬기", 50); 
		System.out.println(hm.size());
		System.out.println(hm);
		
		Integer v = hm.get("웬디");
		System.out.println(v);
		
		Integer v2 = hm.get("아이린");
		System.out.println(v2);
		
		boolean c1 = hm.containsKey("조이");
		System.out.println(c1);
		
		boolean c2 = hm.containsValue(50);
		System.out.println(c2);

		
		// 입력한 이름이 있으면 나이출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		if (hm.containsKey(name)) {
			int age = hm.get(name);
			System.out.println(age + "살");
		}
		else {
			System.out.println("없습니다");
		}
		
		System.out.println("-----------------");
		Map<String,Integer> goal = new HashMap<String,Integer>();
		goal.put("손흥민", 10);
		goal.put("메시", 7);
		goal.put("호날두", 9);
		
		Set<String>ks = goal.keySet();
		System.out.println();
		for(String s:ks) {
			System.out.println(s + ":" + goal.get(s));
		}
		
	}
}
