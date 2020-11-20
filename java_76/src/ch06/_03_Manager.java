package ch06;

public class _03_Manager extends _03_Employee {
	
	private int bonus;
	//디폴트 생성자
	public _03_Manager() {}
	
	//멤버메서드(get/set)
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	//printinfo
	@Override //재정의 대문자로 시작!
	public void printinfo() {
		super.printinfo(); //부모의 메서드 super가 참조변수
		System.out.println("보너스 : " + this.bonus);
	}
}
