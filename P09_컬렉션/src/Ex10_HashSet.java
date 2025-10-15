import java.util.HashSet;
import java.util.Iterator;

public class Ex10_HashSet {
	public static void main(String[] args) {
		// 로또 배열
		// 1~10 중복 안되는 난수 발생
		int [] arr = new int[6];
		int i=0;
		int j=0;
		while(true) {
			arr[i] = (int)(Math.random()*10)+1;
			for(j=0;j<i;j+=1) {
				if(arr[i] == arr[j]) {
					arr[i] = (int)(Math.random()*10)+1;
					j=-1;
				}
			}
			i+=1;
			if (i==6)
				break;
		}
		// 로또 배열 출력
		for (i=0;i<arr.length;i+=1) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
		// HashSet 사용
		HashSet<Integer> hs = new HashSet<Integer>();
		int count=0;
		while(true) {
			int num = (int)(Math.random()*10)+1;
			hs.add(num);
			count+=1;
			if(hs.size()==6)
				break;
		}
		System.out.println(hs);
	}
}
