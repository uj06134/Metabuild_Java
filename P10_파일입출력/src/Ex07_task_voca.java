import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex07_task_voca {
	public static void main(String[] args) throws IOException {
		int selectNum;
		String word;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br;
		Scanner sc = new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));
		boolean find;
		while(true) {
			System.out.print("1.단어입력 2.단어검색 3.종료 \n>>");
			selectNum = sc.nextInt();
			switch(selectNum) {
				case 1: {
					System.out.print("단어/뜻 입력>>");
					word = br.readLine();
					fw = new FileWriter("voca.txt",true);
					bw = new BufferedWriter(fw, 3);
					bw.write(word);
					bw.newLine();
					bw.flush();	
					break;
				}
				case 2: {
					System.out.print("검색 단어 입력>>");
					String target = br.readLine();
					fr = new FileReader("voca.txt");
					br = new BufferedReader(fr, 3);
					find = false;
					while(true) {
						String line = br.readLine();
						if (line == null)
							break;

						int index = line.indexOf("/"); 
						if (index == -1)
							continue;  

						String word2 = line.substring(0, index);        
						String meaning = line.substring(index + 1);

						if (word2.equals(target)) {
							System.out.println("단어>" + word2);
							System.out.println("단어의 뜻>" + meaning);	
							find = true;
							break;
						}
					}
					if (find == false) {
						System.out.println("찾는 단어 없음");
					}
					break;   
				}
				case 3: {
					System.out.println("프로그램을 종료합니다");
					bw.close();
					br.close();
					System.exit(0); 
				}
			}
		}
	}
}