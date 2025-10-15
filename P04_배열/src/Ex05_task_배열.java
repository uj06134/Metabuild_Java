/*
피보나치 수열 
0 1 2 3 4 5  6  7  8  9
1 1 2 3 5 8 13 21 34 55 
배열 출력
0번, 1번에는 1,1을 넣고 시작하기
 */
public class Ex05_task_배열 {
	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 1;
		x[1] = 1;

		int i;
		for(i=0;i<x.length;i+=1) {
			if (i < 2) {
				continue;
			}
			else {
				x[i] = x[i-1] + x[i-2];
			}
		}
		// 배열 출력
		for (i=0;i<x.length;i++) {
			System.out.print(x[i] + " ");
		}

	}
}
