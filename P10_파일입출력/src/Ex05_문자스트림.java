import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Ex05_문자스트림 {
	public static void main(String[] args) {
		System.out.println(123);
		PrintStream ps = System.out;
		ps.println(456);
		
		FileWriter fw = null;	
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter("write.txt"); // 1차 스트림
			bw = new BufferedWriter(fw, 3);
			bw.write("문자스트림1");
			bw.newLine(); // enter
			bw.write("문자스트림2");
			bw.flush();
			
			fr = new FileReader("write.txt"); // FileNotFoundException
			br = new BufferedReader(fr, 3);
			int r;
			// Eof(-1)를 만나지 않을때 까지 반복
//			while((r=br.read())!= -1) {
//				System.out.print((char)r);
//			}
			while(true) {
				String line = br.readLine(); // readLine(): 한줄 읽기
				if(line == null)
					break;
				System.out.println(line);
			}
			
		} catch (IOException e) { // 다형성: IOException e = new FileNotFoundException();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
			}
		}
		
	}
}
