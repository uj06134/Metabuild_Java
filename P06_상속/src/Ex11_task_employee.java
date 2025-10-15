/*
추상클래스 과제
정규직 계약직 일용직 월급 계산 메서드 필수
getMinthPay() 추상메서드로 지정
Employee는 추상클래스로 냅두고 상속된 자녀들이 getMinthPay()를 완성, 이름만 상속해주기
정규적 (pay/(double)12) + (bonus/(double)12) 
계약직 pay/(double)12 * hireYear 
일용직 pay * workDay
display를 이용해 개인정보 출력, 임금출력
*/
// 직원 
abstract class Employee{
	public String empno; 
	public String name; 
	public int pay;
	public abstract double getMonthPay();

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public void display(){
		System.out.println("사번:" + empno);
		System.out.println("이름:" + name);
		System.out.println("금액:" + pay);
	}
}

// 정규직
class FullTime extends Employee{
	public int bonus;
	
	public FullTime(String empno ,String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	@Override
	public double getMonthPay() {
		return (pay/(double)12) + (bonus/(double)12);
	}
	public void display() {
		super.display();
		System.out.println("보너스:" + bonus);
	}
}
// 계약직
class Contract extends Employee{
	public int hireYear;

	public Contract(String empno ,String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return pay/(double)12 * hireYear; 
	}
	public void display() {
		super.display();
		System.out.println("계약기간:" + hireYear);
	}
}
// 일용직
class PartTime extends Employee{
	public int workDay;
	
	public PartTime(String empno ,String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	@Override
	public double getMonthPay() {
		return pay * workDay;
	}
	public void display() {
		super.display();
		System.out.println("월근무일:" + workDay);
	}
}

public class Ex11_task_employee {

	public static void main(String[] args) {
		FullTime f = new FullTime("F01", "웬디", 3000, 200);
		Contract c = new Contract("C01", "조이", 3000, 1);
		PartTime p = new PartTime("P01", "슬기", 10, 30);
		
		System.out.println(f.getMonthPay());
		f.display(); // 개인정보 출력
		System.out.println(c.getMonthPay());
		c.display(); // 개인정보 출력
		System.out.println(p.getMonthPay());
		p.display(); // 개인정보 출력
		
		System.out.println("----------------------");
		
		// 배열로 만들어서 다시 출력
		Employee [] e = {f, c, p};
		
		int i;
		// 예외처리
		try{for (i=0;i<=e.length;i+=1) {
			System.out.println(e[i].getMonthPay());
			e[i].display();}
		}
		catch (Exception ex){
			System.out.println("없는 배열에 접근");
			
		}
			
	}

}