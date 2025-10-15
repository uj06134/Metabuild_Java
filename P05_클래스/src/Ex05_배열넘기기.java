public class Ex05_배열넘기기 {
	public static void main(String[] args) {
		int[] src = {3, 4, 5};
		send(src[0], src[1], src[2]);
		send2(src);
	}
	public static void send(int a, int b, int c){ // static 메서드에서는 static 메서드만 호출 가능
		System.out.println(a + " " + b + " " + c);
	}
	public static void send2(int[] des) { // des: 주소
		int i;
		for(i=0;i<des.length;i+=1) {
			System.out.print(des[i] + " ");
		}

	}

}
