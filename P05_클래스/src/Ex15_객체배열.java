class Book{
	private String title;
	private int price;
	
	public Book() {
		this.title = "java";
		this.price = 1000;
	}
	
	public Book(String title) {
		this.title = title;
		this.price = 2000;
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void display() {
		System.out.println(title + ", " + price);
	}
	
}

public class Ex15_객체배열 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		// 객체를 배열로 만드는 법
		Book [] bk1 = {new Book(), new Book("Oracle"), new Book("Spring", 5000)};
		
		Book [] bk2 = new Book[3];
		bk2[0] = new Book();
		bk2[1] = new Book();
		bk2[2] = new Book();
		
		int i=0;
		for (i=0;i<bk1.length;i+=1) {
			bk1[i].display();
		}
		
	}
}
