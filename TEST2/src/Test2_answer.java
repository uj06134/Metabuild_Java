import java.util.ArrayList;
import java.util.Scanner;

class Product{
	private String code;
	private int price;
	public Product(String code, int price) {
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
	public void display() {
		System.out.print(code+","+price+",");
	}
}//Product

class Book extends Product{
	private String title;
	private String author;
	public Book(String code, int price, String title, String author) {
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
	public void display() {
		super.display();
		System.out.println(title+","+author);
	}
}//Book

public class Test2_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code, title, author, retry;
		int price,i;
		ArrayList<Book> list = new ArrayList<Book>();
		boolean flag = false;
		
		while(true) {
			System.out.print("코드입력:");
			code = sc.next();
			System.out.print("가격입력:");
			price = sc.nextInt();
			System.out.print("제목입력:");
			title = sc.next();
			System.out.print("저자입력:");
			author = sc.next();
			
			Book bk = new Book(code,price,title,author);
			list.add(bk);
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		System.out.println("ArrayList 사용한 결과");
		for(i=0;i<list.size();i++) {
			Book bk = list.get(i);
			bk.display();
		}
		
		while(true) {
			flag = false;
			System.out.print("찾는 제목?");
			title = sc.next();
			for(i=0;i<list.size();i++) {
				Book bk = list.get(i);
				if(bk.getTitle().equals(title)) {
					System.out.println(bk.getCode()+","+bk.getPrice()+","+bk.getAuthor());
					flag = true;
				}
			}//for
			
			if(flag == false) {
				System.out.println("찾는 제목 없음");
			}
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}//while
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
/*
코드입력:A1
가격입력:1000
제목입력:자바
저자입력:윤아
*******************************
계속?y
코드입력:B1
가격입력:2000
제목입력:오라클
저자입력:현아
*******************************
계속?n
ArrayList 사용한 결과
A1,1000,자바,윤아
B1,2000,오라클,현아
찾는 제목:오라클
B1,2000,현아
계속?y
찾는 제목:abc
찾는 제목 없음
계속?n
프로그램을 종료합니다.
*/
//2:15