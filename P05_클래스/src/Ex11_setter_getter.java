/*
private는 외부에선 접근할 수 없기때문에 꺼내는것도, 값을 넣는것도 메서드의 도움이 필요하다. 
getter는 private를 외부로 꺼내는 메서드
setter는 private에 값을 넣는 메서드 
*/

class Fruit{
	private String name;
	private int price;
	
	public void setName(String n) {// setter 메서드
		name = n;
	}
	
	public void setPrice(int p){// setter 메서드
		if (p>0) {
			price = p;
		}
	}
	// pivate 출력
	public String getName() {// getter 메서드
		return name;
	}
	
	public int getPrice() {// getter 메서드
		return price;
	}
}
public class Ex11_setter_getter {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		
		// setter 메서드 호출
		f.setName("포도");
		f.setPrice(3000);
		
		// getter 메서드 호출
		String s1 = f.getName();
		System.out.println(s1);
		
		int s2 = f.getPrice();
		System.out.println(s2);
	}
}
