import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_바이트스트림 {
	public static void main(String[] args) {
		// 반드시 예외처리 필요
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("from.txt"); // from.txt에서 읽어오기
			fos = new FileOutputStream("a\\to.txt",true); // a\\to.txt: a폴더 밑에 to.txt파일 // false가 기본값, true는 실행할때마다 기존파일에 내용 추가
			int r;
			while(true) {
				r = fis.read();
				// EOF: End Of File의 약자, 더 이상 읽을 수 있는 데이터가 없다는 상태
				// EOF(-1)를 읽으면 탈출
				if(r==-1)
					break;
				fos.write(r); // 한글자씩 출력
			}
		} catch (FileNotFoundException e) {
			System.out.println("from.txt파일 발견 못함");
		} catch (IOException e) {
			System.out.println("read()중에 예외 발생");
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
