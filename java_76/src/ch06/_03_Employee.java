package ch06;
//부모
// 시험 10
public class _03_Employee {
	private String sabun;
	private String name;
	private String dept;
	private int salary;
	
	public _03_Employee() {}
	
	//set get
	public void  setSabun (String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDept (String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	
	public void printinfo() {
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : " + name);
		System.out.println("부서명 : " + dept);
		System.out.println("급여 : " + salary);
	}
	
	//printinfo
}
