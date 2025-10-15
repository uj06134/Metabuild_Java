/*

 *****
 ****
 ***
 **
 *
 위 그림의 별 출력하기

 */
public class Ex09_task_for {
	public static void main(String[] args) {
		int i, j;
		for(i=1;i<=5;i+=1) {
			for(j=5;j>=i;j-=1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}