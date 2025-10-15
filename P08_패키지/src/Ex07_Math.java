import java.util.Scanner;

public class Ex07_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] my = new int[6];
		int [] lotto = new int[6];
		int i;
		int j;
		for (i=0;i<lotto.length;i+=1) {
			for (j=0;j<i;j+=1) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45)+1;
					j= -1;
				}
			}
		}
		for(i=0;i<my.length;i+=1) {
			System.out.print("숫자" + (i+1) + ":");
			my[i] = sc.nextInt();
		}
		
	
		System.out.println("컴이 발생시킨 로또 번호");
		for (i=0;i<lotto.length;i+=1) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		System.out.println("내가 입력한 로또 번호");
		for(i=0;i<my.length;i+=1) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		int count = 0;
		for (i=0;i<lotto.length;i++) {
			for(j=0;j<my.length;j++) {
				if(lotto[i]==my[j]) {
					count +=1;
				}
			}
		}
		
		System.out.println("맞은 갯수:" + count);
		switch(count) {
		case 6 : System.out.println("1등 당첨입니다."); break;
		case 5 : System.out.println("2등 당첨입니다."); break;
		case 4 : System.out.println("3등 당첨입니다."); break;
		default : System.out.println("꽝!!");
		}
		
		
	}
}
