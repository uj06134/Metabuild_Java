class Sports{ // class Sports extends Object: 기본적으로 Object클래스는 모든 클래스에 상속된다 
	String name;
	int inwon;

	public Sports(){} //기본생성자
	// 자식 클래스 생성자(Baseball(...))가 실행되면, 가장 먼저 부모 생성자(super(...))를 호출해야 합니다.
	// 만약 자식 클래스에서 super(name, inwon)처럼 특정 부모 생성자를 명시하지 않으면, 자동으로 super(); (기본생성자) 호출이 삽입됩니다.
	// 그런데 부모(Sports)에 기본생성자가 없으면 컴파일 에러가 발생합니다.
	// 따라서 기본 생성자를 생성

	public Sports(String name,int inwon) {
		this.name = name;
		this.inwon = inwon;
	}
	public void display() {
		System.out.println("스포츠명:" + name);
		System.out.println("인원수:" + inwon);
	}
}

class Baseball extends Sports{ // class 자식클래스 extends 부모 클래스
	//    String name;  // 부모에게 물려받음
	//    int inwon;     // 부모에게 물려받음
	double ta;

	public Baseball(String name,int inwon,double ta){
		// 아무것도 없는 부모의 기본생성자를 호출해야 하기때문에 기본생성자가 없을 경우 위에서 생성해야함
		// super(); // 부모 생성자 호출(적지않아도 자동생성)

		this.name = name;
		this.inwon = inwon;
		this.ta = ta;
	}


	public void display() {
		//		System.out.println("스포츠명:" + name); 
		//		System.out.println("인원수:" + inwon); 
		super.display(); // 부모의 디스플레이 호출
		System.out.println("타율:" + ta);
	}

}

class Football extends Sports{
	int goal;

	public Football(String name, int inwon, int goal) {
		this.name = name;
		this.inwon = inwon;
		this.goal = goal;
	}

	// 오버라이딩(overriding): 상속
	public void display() {
		super.display();
		System.out.println("득점수:" + goal);
	}
}

public class Ex01_상속 {

	public static void main(String[] args) {
		Sports s = new Sports("예시", 100);
		s.display();
		System.out.println();

		Baseball b = new Baseball("야구", 9, 0.345);
		b.display();
		System.out.println();

		Football f = new Football("축구", 11, 3);
		f.display();
		System.out.println();

		Sports b2 = new Baseball("야구", 9, 0.345);
		b2.display();
		System.out.println();

		Sports f2 = new Football("축구", 11, 3);
		f2.display();
		
		System.out.println("------------------");
		
		// 배열로 만들기
		Sports [] arr = {
				new Baseball("야구", 9, 0.345),
				new Football("축구", 11, 3)
		};
		
		int i;
		for(i=0;i<arr.length;i+=1) {
			arr[i].display();
		}
	}

}