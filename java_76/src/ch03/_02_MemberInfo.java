package ch03;

public class _02_MemberInfo {
	
	/*
	* String 'birthdate' String name; int age; String address;
	*/

	// 생성자

	// 멈버메서드
	
	// 멤버변수  //3. setter로 전달받은 값을 멤버변수에 저장
	private String birthDay; //private(캡슐화) : 나한테 직접값을 입력하지마.철벽!!
	private String name;
	private int age;
	private String address;
	
	// setter (값을설정)(멈베변수 대문자로)  //2.매개변수값을 멤버변수로전달
	public void setBirthDay(String birthDay) { //매개체역할(매개변수)/지역변수
		this.birthDay = birthDay;
	}
	public void setName(String name) {//중괄호의 의미는 동작이 구현되는 클래스
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	// getter (값을가져오고)
	
	public void showInfo() { //4.멤버변수의 값을 출력
		System.out.println("생년월일 : " + birthDay);//변수앞에this생략
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);		
	}

}
