interface Camera{
	void takePhoto();
}
interface Sports2{
	void exercise();
}
class Shape2{
	private int size;
	private String color;
	
	public void setSize(int size){
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}

// 상속 순서 class -> interface
class Phone extends Shape2 implements Camera, Sports2{

	@Override
	public void exercise() {
		System.out.println("운동한다");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("사진찍는다");
	}
	
}
public class Ex13_인터페이스 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setSize(10);
		p.setColor("blue");
		
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		
		p.takePhoto();
		p.exercise();
	}
}
