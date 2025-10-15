import java.util.ArrayList;
import java.util.Scanner;

class Product_khj {
	private String code;
	private int price;
	public Product_khj(String code, int price) {
		super();
		this.code = code;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

class Book_khj extends Product_khj {
	private String title;
	private String author;

	public Book_khj(String code, int price, String title, String author) {
		super(code, price);
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
public class Test2_김훈종 {
	public static void main(String[] args) {
		ArrayList<Book_khj> list = new ArrayList<Book_khj>();
		Scanner sc = new Scanner(System.in);
		String code, title, author, menu;
		boolean find;
		int price, i;
		while (true) {
			System.out.print("코드입력:");
			code = sc.next();
			System.out.print("가격입력:");
			price = sc.nextInt();
			System.out.print("제목입력:");
			title = sc.next();
			System.out.print("저자입력:");
			author = sc.next();

			Book_khj b = new Book_khj(code, price, title, author);
			list.add(b);

			System.out.print("계속?");
			menu = sc.next();
			if(menu.equals("y")) {
				continue;
			}
			if(menu.equals("n")) {
				break;
			}
		} // while1
		System.out.println("ArrayList 사용한 결과");
		for (i=0;i<list.size();i+=1) {
			Book_khj b2 = list.get(i);
			System.out.println(b2.getCode() + "," + b2.getPrice() + "," + b2.getTitle() + "," + b2.getAuthor());
		}
		while (true) {
			find=false;
			System.out.print("찾는 제목:");
			title = sc.next();
			for (i=0;i<list.size();i+=1) {
				Book_khj b3 = list.get(i);
				if (b3.getTitle().equals(title)) {
					System.out.println(b3.getCode() + "," + b3.getPrice() + "," + b3.getAuthor());
					find = true;
					break;
				}
			}
			if (find==false) {
				System.out.println("찾는 제목 없음");
			}
			System.out.print("계속?");
			menu = sc.next();
			if(menu.equals("y")) {
				continue;
			}
			if(menu.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	} // while 2
}
