import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11_SimpleDateFormat {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd E");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd hh:mm:ss a");
		System.out.println(sdf2.format(now));
	}
}
