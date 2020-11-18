package ch05;

public class _04_Member {
	//멤버변수
	private String name; 
	private int age;
	private String email;
	private String add;
	
	//디폴트생성자
	public _04_Member() {}
	//매개변수생성자
	public _04_Member(String name, int age, String email, String add) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.add = add;
	}
	//멤버메소드(setter, getter)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAdd() {
		return add;
	}
	// showInfo
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일  : " + email);
		System.out.println("주소 : " + add);
	}
}
