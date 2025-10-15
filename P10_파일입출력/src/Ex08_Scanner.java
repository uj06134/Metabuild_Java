import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("read.txt")).useDelimiter(","); // ,를 기반으로 자르기
		int num, sum=0, count=0;
		while(sc.hasNextInt()) {
			count+=1;
			num = sc.nextInt();
			System.out.println(num);
			sum += num;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/(double)count);
		
		sc.close();
	}
}
