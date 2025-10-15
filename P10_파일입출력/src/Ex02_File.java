import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args) {
		File f1 = new File("A");
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"abc.txt"); // A폴더\abc.txt
		
		// 존재 여부
		if(f1.exists()) {
			f1.renameTo(f2);
			System.out.println("폴더명 변경");
		}else {
			f1.mkdir();
			System.out.println("폴더생성");
		}
		
		// 반드시 예외처리 필요
		try { 
			f4.createNewFile();
			System.out.println("파일 생성함");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성중 예외 발생");
		}
		
		if(f3.exists()) { // 삭제 성공하면 true, 실패하면 false
			boolean d = f3.delete(); // 폴더안에 파일이 있으면 삭제 실패
			System.out.println(d);
		}
	}
}
