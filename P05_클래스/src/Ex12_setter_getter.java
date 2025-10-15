class Human{
	private String name;
	private int age;
	private double height;

	// setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// getter 메서드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}
}

public class Ex12_setter_getter {
	public static void main(String[] args) {
		Human h = new Human();
		h.setName("윤아");
		h.setAge(30);
		h.setHeight(172.9);
		
		String name = h.getName();
		System.out.println(name);
		
		int age = h.getAge();
		System.out.println(age);
		
		double height = h.getHeight();
		System.out.println(height);
	}

}
