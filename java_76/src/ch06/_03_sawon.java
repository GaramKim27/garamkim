package ch06;
//자식
public class _03_sawon extends _03_Employee {
	private int sudang;
	
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang; //나의
	}
	/* p250 [면접] 오버로드 vs 오버라이드 차이점!!
	 * @Override : 어노테이션 : "이 메서드는 재정의된 메서드입니다."라고 컴파일러한테 명확히 알려주는 역할을 한다.
	 * 오버라이딩(=재정의) 
	 * -자식클래스의 메서드가 부모클래스의 메서드를 오버라이드(재정의)한다라고 말한다.
	 * -상속에서 부모클래스의 메서드를 변경하고자 할 때 사용한다.
	 * -메서드의 이름, 매개변수, 매개변수 자료형, 반환형까지 모두 동일해야한다.
	 * (동일하지 않으면 컴파일러가 다른 메서드로 인식한다.)
	 * -호출시 오버라이딩한 자식메서드가 호출된다.
	 * (오버라이드의 목적: 부모클래스의 메서드를 변경해서 자식쪽에서 호출하고자하는 의도)
	 *  사전적인 의미 : 부모메서드의 기능을 무시한다는 의미이다.
	 *  
	 */
	
	// @Override : 어노테이션 
	// @Override:부모의메서를 재정의
	@Override
	public void printinfo() { //슈퍼마켓하는 부모님
		/*  p244
		 *  super : 부모의 참조변수
		 *  - 하위클래스에서 상위클래스로 접근할 때 사용한다.
		 *    하위클래스는 상의 클래스의 주소, 즉 참조값을 알고있다.
		 *  - 상위클래스의 생성자를 호출할 때 사용된다.
		 *    예) super();
		 *    
		 *   cf) this : 자기자신의 주소값
		 * 	  	 
		 */
		super.printinfo(); //제일좋고 깔끔한방법
		//방법1. super 동일한메서드가 부모,자식 양쪽에 있을경우, 이때 super는 생략하면 this자식메서드가 호출된다.
		//부모클래스(super)의 printinfo();
		
		// 방법2 부모멤버변수 :protected로 수정
		//System.out.println("사번 : " + sabun);
		//System.out.println("이름 : " + name);
		//System.out.println("부서명 : " + dept);
		//System.out.println("급여 : " + salary);
		
		//방법3. 부모멤버메서드 : 부모멤버변수가 private인경우
		//super생략해도무관 : 아래메서드들은 부모쪽에만 있으므로
		//
		//System.out.println("사번 : " + super.getSabun());
		//System.out.println("이름 : " + super.getName());
		//System.out.println("부서명 : " + super.getDept());
		//System.out.println("급여 : " + super.getSalary());
		
		System.out.println("추가수당 :" + this.sudang);
	}
}
