/*
다중상속 예제 만들기 ex) person-worker-teacher
모든 변수는 private 
*/
class Cafe{
	private String cafeName;
	private String location;
	
	// Cafe 생성자
	public Cafe(String cafeName, String location) {
		this.cafeName = cafeName;
		this.location = location;		
	}
	
	// display
	public void display() {
		System.out.println("카페명:" + cafeName);
		System.out.println("위치:" + location);
	}
}

class Menu extends Cafe{
	private String menuName;
	private int price;
	
	// Menu 생성자
	public Menu(String cafeName, String location, String menuName, int price) {
		super(cafeName, location);
		this.menuName = menuName;
		this.price = price;	
	}
	
	// display
	public void display() {
		super.display();
		System.out.println("메뉴명:" + menuName);
		System.out.println("가격:" + price);
	}
	
}

class Customer extends Menu{
	private int orderCount;
	
	// Customer 생성자
	public Customer(String cafeName, String location, String menuName, int price, int orderCount) {
		super(cafeName, location, menuName, price);
		this.orderCount = orderCount;
	}
	
	// display
	public void display() {
		super.display();
		System.out.println("주문수량:" + orderCount);
	}
}
public class Ex05_task_상속 {
	public static void main(String[] args) {
		Cafe c = new Cafe("메가커피", "강남역");
		c.display();
		System.out.println("-------------------");
		
		Menu m = new Menu("이디야", "역삼역", "아이스티", 3000);
		m.display();
		System.out.println("-------------------");
		
		// 다형성
		Cafe cu = new Customer("스타벅스", "교대역", "아메리카노", 5000, 3);
		cu.display();
		
	}
}
