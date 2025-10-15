/*
2단~9단까지 1씩 증가 
ex)2단은 2단까지, 4단은 4단까지,6단은 6단까지 ,8단은 8단까지 출력
continue, break 활용
*/
public class Ex13_task_2중for {
	public static void main(String[] args) {
		int i, j;
		for(i=2;i<=9;i+=1) {
			for(j=1;j<=9;j+=1) {
				if(i%2!=0) {
					continue;
				}
				if(i<j) {
					break;
				}
				System.out.println(i + "*" + j + "=" + i*j );
			}
		}
	}
}
