public class Ex04_2차원 {
	public static void main(String[] args) {
		int [][] score = {
							{10,20,30,40},
							{50,60},
							{90,100,110}
		};
		
//		int [][] score = new int [3][];
//		score[0] = new int[] {10,20,30,40};
//		score[1] = new int[] {50, 60};
//		score[2] = new int[] {90, 100, 110};
		
		System.out.println(score);		//총 관리자
		System.out.println(score[0]);	//0번 관리자
		System.out.println(score[1]);	//1번 관리자
		System.out.println(score[2]);	//2번 관리자
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
		System.out.println(score[0][3]);
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[1].length);
		System.out.println(score[2].length);
		
		System.out.println("--------------");
		int i,j;
		for(i=0;i<score.length;i+=1) {
			for(j=0;j<score[i].length;j+=1) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//확장 for문
		for(int[] y : score) {//int[] y = {10,20,30,40}
			for(int z: y) {
				System.out.print(z + " ");
			}
			System.out.println();
		}		
	}
}
