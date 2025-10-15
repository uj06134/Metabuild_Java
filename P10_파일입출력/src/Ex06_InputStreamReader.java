import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex06_InputStreamReader {
	public static void main(String[] args) throws IOException {
		System.out.print("문자열 입력: ");
		InputStream is = System.in; // InputStream(바이트 입력): 한글은 읽을 수 없음
		
		// 바이트 입력 -> 문자입력
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		
		// 세줄을 한줄로 표현
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		System.out.println(s);
	}
}
