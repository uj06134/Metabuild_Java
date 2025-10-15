public class Ex03_정렬 {
	public static void main(String[] args) {
		// 오름차순 정렬
		int[] arr = {8, 3, 5, 2, 9};
		int i, j, temp;
		for(i=0;i<arr.length;i+=1) {
			for(j=i+1;j<arr.length;j+=1) {				
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
;				}
			}
		}
		for(i=0;i < arr.length;i+=1) {
			System.out.print(arr[i] + " ");
		}
	}
}
