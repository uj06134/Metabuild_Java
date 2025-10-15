import java.util.Scanner;

public class Ex02_1차원 {
	public static void main(String[] args) {
		String [] name = {"윤아", "아이유", "수지"};
		int [] score = new int[3];
		Scanner sc = new Scanner(System.in);
		int i;
		for (i=0;i<name.length;i+=1) {
			System.out.print(name[i] + "의 점수: ");
			score[i] = sc.nextInt();
		}
		for (i=0;i<name.length;i+=1) {
			System.out.println(name[i] + "의 점수는 " + score[i] + "점");
		}
	}
}
