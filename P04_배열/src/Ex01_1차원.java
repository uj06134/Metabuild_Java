public class Ex01_1차원 {
	public static void main(String[] args) {
		//배열: 같은 타입(자료형)의 데이터를 한묶음으로 묶어서 관리하는 것
		//연속된 메모리를 갖는다
		int [] x = {10, 20, 30};
//		int [] x = new int[] {10, 20, 30};
//		int[] x = new int[3];
//		x[0] = 10;
//		x[1] = 20;
//		x[2] = 30;
		
		System.out.println("x: " + x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println("--------------------");
		
		int i;
		for(i=0;i<x.length;i+=1) {
			System.out.println(x[i]);
		}
		System.out.println(x.length);
		System.out.println("--------------------");
		int sum=0;
		int[] score = {77, 89, 92, 40, 97, 68};
		for(i=0;i<score.length;i+=1) {
			System.out.print(score[i] + " ");
			sum = sum + score[i];
		}
		System.out.println("\n합계: " + sum);
		System.out.printf("평균: %.2f\n" ,(double)sum/score.length);
		
		int max, min;
		max = score[0]; //max = 77
		min = score[0]; //min = 77
		for(i=1;i<score.length;i+=1) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		System.out.println("--------------------");

		//확장for 문
		for(int y : x) {
			System.out.println(y);
			
		}
	}
}
