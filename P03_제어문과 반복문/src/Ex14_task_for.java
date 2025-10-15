/*
1~100까지 합계구하기
for문은 한번만 사용
예시
1~10=55
1~20=210
1~30=465
...
1~100=5050
*/
public class Ex14_task_for {
	public static void main(String[] args) {
		int i; 
		int sum = 0;
		for(i=1;i<=100;i+=1) {
			sum = sum + i;
			if(i%10==0){
				System.out.println(1 + "~" + i + "=" + sum);
			}
		}
	}
}
