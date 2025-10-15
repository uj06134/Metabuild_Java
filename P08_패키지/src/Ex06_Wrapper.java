public class Ex06_Wrapper {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int i;
		int sum = 0;
		for(i=0;i<arr.length;i+=1) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		// 합계 출력
		String [] arr2 = {"1", "2", "3", "4", "5"};
		int sum2=0;
		for(i=0;i<arr2.length;i+=1) {
			sum2 += Integer.parseInt(arr2[i]);
		}
		System.out.println(sum2);
		
		// 세명의 합계 출력
		String[] arr3 = {"웬디:70","아이유:90","최강창민:80"};
		int sum3 = 0;
		for(i=0;i<arr3.length;i+=1) {
			int index = arr3[i].indexOf(":");
			String sub = arr3[i].substring(index + 1);
			int num = Integer.parseInt(sub);
			sum3 += num;
		}
		System.out.println(sum3);
 	}
}
