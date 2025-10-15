/*
알파벳 개수 세기
a:? 
b:? 
c:?
...
z:?
a를 만나면 0번방 증가 ... z를 만나면 26번방 증가
str의 글자 개수 세기 len(i)
0번째 글자  
1번째 글자
...  
i번째 글자  
ex) 
아스키코드 b(98) - 97 = 1번방++
아스키코드 d(100) - 97 = 2번방++
아스키코드 B(66) - 65 = 3번방++ (대문자)
공백 주의
 */

public class Ex03_task_answer {
	public static void main(String[] args) {
		String str = "Victory belongs to the most persevering";
	
		int[] alpha = new int[26]; 
		// 0 3 3 2... 0
		// a b c d... z
		int length = str.length();
		System.out.println("length:" + length);
		int i;
		char ch;
		for(i=0;i<length;i++) { // i=0
			ch = str.charAt(i);
			//System.out.println(ch);
			if(ch>='A' && ch<='Z') { // 대문자인가?
				//a=0 b=1 c=2 z=25
				alpha[ch-65]++; //65-65
			}else if(ch>='a' && ch<='z') { // 소문자인가?
				alpha[ch-97]++;
			}
		}//for
		
		for(i=0;i<alpha.length;i++) {
			System.out.println((char)(97+i)+":"+alpha[i]);
			
		}
	}
}

