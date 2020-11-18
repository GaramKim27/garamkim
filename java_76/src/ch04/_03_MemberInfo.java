package ch04;

public class _03_MemberInfo {
	//클래스는 = 멤버변수 + 생성자 = 멤버메서드
	
	// 멤버변수
	private String name;
	private int age;
	private String email;
	
	// 디폴트생성자 : 매개변수가 없는 생성자
	// 생성자이름은 클래스이름과같고, 반환값이 없으며, 매개변수없음, 멤버변수 초기화목적
	// 디폴트생성자를 생략시 컴파일할 때 컴파일러에서 자동으오 생성자를 만들어 준다.
	// 인스턴스 생성됨과 동시에  호출된다.
	public _03_MemberInfo() {
		System.out.println("디폴트생성자");
	}
	
	// 매개변수 생성자 : 매개변수가 있는 생성자
	// 생성자이름은 클래스이름과같고, 반환값이 없으며, 매개변수없음, 멤버변수 초기화목적
	// 자바컴파일러는 생성자가 하나도 없는 경우에만 디폴트 생성자를 제공한다.
	// 즉 프로그래머가 생성자를 직접 추가하면 디폴트 생성자는 만들어지지 않는다.
	
	// 생성자 오버로드
	// [면접] 오버로드 : 메서드나 생성자의 매개변수 갯수가 다르거나, 매개변수 타입이 다른경우를 말한다.(단 return타입은 무관하다.)
	public _03_MemberInfo(String name, int age, String email) {
		System.out.println("매개변수 생성자");
		this.name = name;
		this.age = age;
		this.email = email;		
	}
	
	public _03_MemberInfo(String name, int age ) {
		System.out.println("매개변수 생성자");
		this.name = name;
		this.age = age;
				
	}
	
	
	// 멤버메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 양수로 입력하세요");
			return; //함수를 종료하며, 아래문장을 수행하지않는다.
		}
			this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void printInfo(){
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);	
	}
}
