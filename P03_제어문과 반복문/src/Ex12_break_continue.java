public class Ex12_break_continue {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i+=1) {
			if(i==5)
				break;
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("------------------");
		for(i=1;i<=10;i+=1) {
			if(i==5)
				continue;
			System.out.print(i+" ");
		}
	}
}
