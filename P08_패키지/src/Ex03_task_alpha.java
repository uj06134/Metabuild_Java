public class Ex03_task_alpha {

	public static void main(String[] args) {
		String str = "ABc d e f g h i j k k k K Z";
		str = str.toLowerCase();
		int [] alpha = new int[26];

		int i;
		for(i=0;i<str.length();i+=1) {
			int c = (int)str.charAt(i);
			int index = c - 97;
			try{alpha[index] += 1; // 띄어쓰기 예외처리
			}
			catch (Exception e){
			}
		}
		
		// 배열 출력
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (i=0;i<alpha.length;i++) {
			char ch = alphabet.charAt(i);
			System.out.println(ch + ":" + alpha[i]);
				
		}
	}
}