public class Ex07_for {
	public static void main(String[] args) {
		int i, j;
		for(i=1;i<=9;i+=1) {
			for(j=1;j<10;j+=1) {
				System.out.println(i + "," + j);
			}//안쪽 for문 끝
			System.out.println("--------------------");
		}//바깥쪽 for문 끝
		System.out.println("********************");
	}
}
