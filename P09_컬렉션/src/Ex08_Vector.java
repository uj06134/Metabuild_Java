import java.util.Enumeration;
import java.util.Vector;

public class Ex08_Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("봄");
		v.add("여름");
		v.add("가을");
		v.add("겨울");
		System.out.println(v.size());
		System.out.println(v.toString());
		
		String s = v.get(0);
		System.out.println(s);
		
		System.out.println("----------------");
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) { // 하나라도 가지고 있으면 true 반환
			String e = enu.nextElement();
			System.out.println(e);
		}
		System.out.println("----------------");
		// 확장 for문
		for(String s2:v) {
			System.out.println(s2);
		}
		System.out.println("----------------");
		for (int i=0;i<v.size();i+=1) {
			System.out.println(v.get(i));
		}
	}
}
