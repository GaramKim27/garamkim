package ch03;

public class _02_MemberMain {
	public static void main(String[] args) {
		// static : 인스턴스 생성하지않고 바로 메서드 사용가능
		// main() 함수는 자바가상머신(JVW)이 프로그램을 시작하기 위해 호출하는 함수
		// 클래스 내부에 만들지만, 클래스의 메소드는 아니다.
		_02_MemberInfo MemberInfo = new _02_MemberInfo();
		
		//MemberInfo.birthDay = "1994년 2월 27일"; //1.값전달
		//호출
		MemberInfo.setBirthDay("1994년 2월 27일");
		//MemberInfo.name = "김가람";
		MemberInfo.setName("김가람");//접근이 불가능하기에 set호출
		//MemberInfo.age = 27;
		MemberInfo.setAge(27);
		//MemberInfo.address = "인천";
		MemberInfo.setAddress("인천");
		MemberInfo.showInfo();
	}
}
		// 멤버변수
			/*
			* String 'birthDay' String name; int age; String address;
			 */

				// 생성자

				// 멈버메서드
		
		
		

	
		
	

	
		
	
