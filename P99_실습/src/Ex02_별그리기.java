/*
 	
		*
	   **
	  ***
	 ****
	*****
위 그림의 별 출력하기

*/
public class Ex02_별그리기 {
	public static void main(String[] args) {
		int i, j;
		for(i=1;i<=5;i+=1) {
			for(j=5;j>=1;j-=1) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");

				}
			}
			System.out.println();
		}
	}
}