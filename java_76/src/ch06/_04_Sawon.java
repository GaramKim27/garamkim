package ch06;

// 자식클래스
public class _04_Sawon extends _04_Employee {
	//멤버변수
	private int  sudang;
	
	//디폴트생성자
	public _04_Sawon() {}
	//매개변수생성자
	public _04_Sawon(String sabun, String name, String dept, int salary, int sudang) {
		super(sabun, name, dept, salary);
		this.sudang= sudang;
		System.out.println("자식매개변수 생성자");
	}
	//2. 자식 매개변수 생성자 -> 부모매개변수 생성자
	//set get 멤버메서드
	
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getSudang() {
		return sudang;
	}
	
	public void printInfo() {
		super.printInfo();
			System.out.println("수당 : " + sudang);
	}
}
