public class Ex08_for {
	public static void main(String[] args) {
//		구구단 출력하기
		int i, j;
		for(i=2;i<=9;i+=1) {
			for(j=1;j<10;j+=1) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println("--------------------");
		}
//		구구단 가로로 출력하기
		for(j=1;j<=9;j+=1) {
			for(i=2;i<=9;i+=1) {
				System.out.print(i + "*" + j + "=" + i * j+ "\t");
			}
			System.out.println();
		}
	}
}
