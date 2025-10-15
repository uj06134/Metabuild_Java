import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Movie{
	private String title;
	private int age;
	
	public Movie(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return title + "/" + age;
	}
	
}
public class Ex13_HashMap {

	public static void main(String[] args) {
		Movie m1 = new Movie("좀비딸", 12);
		Movie m2 = new Movie("오징어 게임", 19);
		Movie m3 = new Movie("뽀로로", 7);
		
		Map<String, Movie> movie = new HashMap<String, Movie>();
		movie.put("롯데시네마", m1);
		movie.put("CGV", m2);
		movie.put("메가박스", m3);
		
		Set<String> ks = movie.keySet();
        for (String s : ks) {
            System.out.println(s + ": " + movie.get(s));
        }
        Movie m4 = new  Movie("국제시장", 15);
        // 대체
        movie.replace("메가박스", m4);
        System.out.println(movie);
        
        // 삭제
        movie.remove("CGV");
        System.out.println(movie);
        
        // 키값이 없으면 null
        Movie mr = movie.remove("CGV2");
        System.out.println(mr);
        
        // 전부 삭제
        movie.clear();
        System.out.println(movie);

        
	
	}

}
