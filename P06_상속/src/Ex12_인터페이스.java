interface CopyMachine{ // interface 안에는 오직 미완성 메서드만 들어갈 수 있음
	void copy();
	int age = 30; // static final이 자동으로 붙음
}

interface PrintMachine{
	void print();
}
class Compound implements CopyMachine, PrintMachine{ // interface를 상속 받을 때 implements
	void a() {
		
	}

@Override
public void copy() {
	System.out.println("복사한다");
}

@Override
public void print() {
	System.out.println("프린트한다");
}
}
public class Ex12_인터페이스 {
	public static void main(String[] args) {
		Compound c = new Compound();
		c.copy();
		c.print();
		System.out.println(c.age);
		System.out.println(Compound.age);
//		c.age = 40; error: age앞에 final이 자동으로 붙어 바꿀 수 없음 
		
		System.out.println("----------------");
		
		CopyMachine c2 = new Compound(); // 업캐스팅
		c2.copy();
//		c2.print(); error: 부모가 print를 가지고 있지 않음
		
		PrintMachine c3 = new Compound(); // 업캐스팅
		c3.print(); 
//		c3.copy(); error: 부모가 copy를 가지고 있지 않음
		
		
	}
}
