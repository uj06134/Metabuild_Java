abstract class Shape{ // 추상클래스
	public Shape() {
		System.out.println("Shape 생성자");
	}
	public abstract void draw(); // 추상메서드
	// public - protected - default - private
	protected abstract void delete(); // 완성되는 곳이 접근 제어자가 더 넓어야 함
}

class Circle extends Shape{
	public Circle() {
		System.out.println("Circle 생성자");
	}
	public void draw() {
		System.out.println("원을 그린다");
	}
	public void delete() {
		System.out.println("원을 지운다");
	}
}
class Triangle extends Shape{
	public Triangle() {
		System.out.println("Triangle 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	@Override
	public void delete() {
		System.out.println("삼각형을 지운다");
	}
}

public class Ex10_추상클래스 {
	public static void main(String[] args) {
		// Shape s = new Shape(); 추상클래스로는 객체를 만들 수 없음
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.delete();
	}
}
