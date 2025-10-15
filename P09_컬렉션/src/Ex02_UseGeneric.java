class Top3<T>{ // 미지정 자료형
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class Ex02_UseGeneric {
	public static void main(String[] args) {
		Top3<Integer> t1 = new Top3<Integer>(); // Integer로 자료형 지정
		t1.setData(123);
		Integer x = t1.getData();
		System.out.println(x);

		Top3 <String> t2 = new Top3<String>();// String으로 자료형 지정
		t2.setData("generic");
		String y = t2.getData();
		System.out.println(y);
		
		Top3 <Double> t3 = new Top3<Double>();// Double로 자료형 지정
		t3.setData(1.23);
		Double z = t3.getData();
		System.out.println(z);
	}
}
