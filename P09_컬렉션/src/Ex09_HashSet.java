import java.util.HashSet;
import java.util.Iterator;

public class Ex09_HashSet {
	public static void main(String[] args) {
		//Set interface: 순서x, 중복 허용x
		HashSet<String> hs = new HashSet<String>();
		hs.add("banana");
		hs.add("orange");
		hs.add("banana");
		hs.add("apple");
		hs.add("grape");
		System.out.println(hs);
		System.out.println(hs.size());
		// 비어있으면 참, 비어있지 않으면 거짓
		System.out.println(hs.isEmpty());
		
		Iterator <String> iter = hs.iterator();
		while(iter.hasNext()) { // 값이 있으면 true 없으면 false
			String s = iter.next();
			System.out.println(s);
		}
		
		// 포함 여부
		boolean b = hs.contains("orange");
		System.out.println(b);
		
		// 삭제 성공 여부
		boolean b2 = hs.remove("apple");
		System.out.println(b2);
		
		System.out.println(hs);
	}
}

