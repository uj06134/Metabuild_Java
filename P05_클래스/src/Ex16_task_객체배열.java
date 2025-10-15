/*
입력한 이름, 나이로 Person2객체 만드는 작업 3번하고
Person2객체 3개를 배열로 만들어서 출력하기
*/

import java.util.Scanner;

class Person2{
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name + " " + age);
	}

}

public class Ex16_task_객체배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person2 [] p = new Person2[3];
		int i;
		for(i=0;i<p.length;i+=1) {
			System.out.print("이름 :");
			String name = sc.next();

			System.out.print("나이 :");
			int age = sc.nextInt();

			p[i] = new Person2(name, age);
		}
		for(i=0;i<p.length;i+=1) {
			p[i].display();
		}
	}
}