package ch06;

public class _02_Policecar extends _02_Car {

	/*
	 * 
	 * [면접] 
	 * 상속 자식클래스 extends 부모클래스(...)
	 *  - extends : 확장 파생의 의미
	 *  - 공통으러 사용하는 멤버변수와 멤버메서드를 부모클래스에서 정의한다.
	 *  - 부모클래스는 일반적이고 공통이며, 자식클래스는 구체적이며, 유일하다
	 *  
	 *  -사용이유 :부모클래스의 멤버변수와 멤버메서드를 재사용
	 *  	중복되는 코드를 줄임으로서 손쉽게 개방, 유지보수기능
	 *  -부모클래스의 멤버를 private으로 선언한경우, 자식클래스에서 접근할 수 없다.
	 *  접근제어자 protected의 경우 자식클래서에스 접근가능 or public
	 */
	
	public void siren() {
		System.out.println("사이렌을 울리다~");
	}
}
