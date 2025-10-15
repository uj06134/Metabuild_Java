class Music{
	//m1
	public Music() {
		this.title = "좋은날";
		this.singer = "아이유";
		this.genre = "발라드";
		this.price = 1000;
	}
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	//m2
	public Music(String title, String singer, String genre, int price) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	// setter 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
		
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	// getter 메서드
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getPrice() {
		return price;
	}
	
	//display
	public void display() {
		System.out.println("제목:" + title + ", 가수:" + singer + ", 장르:" + genre +  ", 가격:" + price);
	}
}

public class Ex14_task_생성자 {
	public static void main(String[] args) {
//		m1은 getter로 출력
//		m2, m3는 display()통해서 한번에 출력
		
		Music m1 = new Music(); // 생성자 통한 초기화
		System.out.print("제목:" + m1.getTitle() + ", ");
		System.out.print("가수:" + m1.getSinger() + ", ");
		System.out.print("장르:" + m1.getGenre() + ", ");
		System.out.println("가격:" + m1.getPrice());
		
		Music m2 = new Music("아파트", "로제", "댄스", 2000); // 생성자 통한 초기화
		m2.display();
		
		Music m3 = new Music(); // setter 통한 초기화
		m3.setTitle("붉은 노을");
		m3.setSinger("이문세");
		m3.setGenre("발라드");
		m3.setPrice(3000);
		m3.display();
	}
}
