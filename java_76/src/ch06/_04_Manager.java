package ch06;

//자식클래스
public class _04_Manager extends _04_Employee {
	//멤버변수
	private int bonus;
	
	//디폴트생성자
	public _04_Manager() {
		System.out.println("자식 디폴트생성자");
	}
	
	//매개변수 생성자
	public _04_Manager (String sabun, String name, String dept, int salary, int bonus) {
		super(sabun, name, dept, salary); //부모 매개변수 생성자 호출 첫줄에 작성해야한다.
		this.bonus=bonus;
		System.out.println("자식 매개변수생성자");
	}
	
	//멤버메서드
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : "+ bonus);
	}
	
}
