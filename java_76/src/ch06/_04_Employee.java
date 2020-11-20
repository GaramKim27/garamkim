package ch06;

//부모클래스
//시험이걸로함 (변경)
public class _04_Employee {
	//멤버변수
	//4. 멤버변수에 저장
	private String sabun;
	private String name;
	private String dept;
	private int salary;
	
	// 디폴트생성자.. 매개변수 생성자가 존재하므로 컴파일러가 디폴트생성자를 자동으로 만들어주지 않는다. 디폴트생성자가 없으면 super() 호출시 에러가 발생한다. 
	// 부모 디폴트생성자는 자식보다 먼저 생성된다.
	public _04_Employee() {
		System.out.println("부모 디폴트생성자");
	}
	// 매개변수생성자
	// 부모 매개변수 생성자는 자식 매개변수 생성자보다 먼저 생성된다.
	// 매개변수 -> 멤버변수로 값을 전달
	public _04_Employee(String sabun, String name, String dept, int salary) {
		System.out.println("부모 매개변수 생성자");
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	//멤버메서드
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void printInfo() {
		System.out.println("사번 : " + sabun); //\n 을이용하면 한줄로끝
		System.out.println("이름 : " + name);
		System.out.println("부서명 : " + dept);
		System.out.println("급여 : " + salary);
		
	}
}
