import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_Buffer {
	public static void main(String[] args) {
		int i;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			// 쓰기
			fos = new FileOutputStream("data.txt"); // 1차 스트림
			// 임시 저장소
			bos = new BufferedOutputStream(fos, 5); // 2차 스트림  // 버퍼가 꽉 차면(5바이트 모이면) → 한꺼번에 fos로 전달
			for (i=1;i<10;i+=1) {
				bos.write(i+48); // 아스키 코드 49("1"), 50("2") ...
			}
			bos.flush(); // 남아 있는 데이터 강제로 비움
			
			// 읽기
			fis = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis, 5);
			
			while(true) {
				int r = bis.read();
				if(r==-1)
					break;
				System.out.println(r);
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				// 5개 나머지 출력
				bos.close(); // 2차 close → flush + fos도 자동 close
				bis.close();
			} catch (IOException e) {
			}
		}
	}
}
