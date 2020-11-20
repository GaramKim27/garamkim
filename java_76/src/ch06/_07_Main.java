package ch06;

public class _07_Main {
	public static void main(String[] args) {
		
		//부모클래스 참조변수 = new 부모클래스
		_07_Ainmal animal = new _07_Ainmal(); 
		animal.move();
		
		
		//}
		
		//자식클래스 참조변수 = new 자식클래스
		_07_Human main1 = new _07_Human();
		main1.move(); //사람이 움직입니다.
		
		/*
		 * 다형성 : 상속이 전제조건이다.
		 * 		하나의 참조변수(부모)로부터 여러가지타입의 객체(자식)을 참조할수있는것.
		 * 		즉 부모타입의 참조변수로 자식타입의 객체를 다룰 수 있는것이 다형성
		 * 		상속이 전제조건이다.
		 * 
		 * 문법 : 부모타입 참조변수 = new 자식타입 ();
		 * 		큰타입                = 작은타입
		 * 
		 * 		부모타입의 갯수가 자식타입의 갯수보다 적으므로 왼쪽에 부모타입이 와야한다.
		 * 		다형성을 적용했을지라도 오버라이딩시 자식메서드가 호출된다.
		 * 		(@Override 어노테이션을 생략해도 마찬가지다.)
		 * 		
		 *- 부모참조변수로 접근시, 부모타입 클래스의 멤버가 힙메모리에 생성된 객체에 존재해야 한다.
		 * 만약 존재하지 않으면 에러가 발생한다.(예, readBook() )
		 * 따라서 자식객체에 접근하기 위해서 다운캐스팅(다운형변환)한다 
		 * 즉, 상위클래스로 형변환 되었던 하위클래스를 다시 원래 자료형으로 형변환 하는것을 다운캐스팅이라고 한다.
		 * -다운캐스팅 (형변환) : 작은타입= (작은타입)큰타입; // 부모가 큰타입, 자식이 작은타입.
		 *
		 *    부모클래스 참조변수 = new 자식클래스();
		 * - 가상메서드 원리에 따라 move() 메서드(오바라이딩메서드)는 힙메모리에 존재하는 실제 인스턴스의 메서드이다.
		 * 오바라이딩시 자식메서드가 호출된다.
		 * -장점 : 모든 클래스를 부모 자료형 하나로 쉽게 관리한다.코드가 간결해진다.
		 * 		특히, 매개변수를 부모자료형 하나로 관히하면 코드가 간결해진다.
		 * 		상위클래스에서 공통부분의 메서드를 제공하고, 하위클래스에서 추가메서드를 구현하면 코드양도 줄어들고 유지보수도 간편하다.
		 *
		 * 
		 */
		
		
		//다형성을 적용하여 인스턴스 생성
		//부모클래스 참조변수 = new 자식클래스
		_07_Ainmal animal2 = new _07_Human();
		animal2.move(); //사람이 움직입니다.
		//animal2.readBook(); //에러가 납니다..
		
		//_07_Human main3 = null; //Animal -> Human으로 형변환 다운캐스팅!!
		if(animal2 instanceof _07_Human) {  //  (부모타입 instanceof 자식타입)
			_07_Human main3 =  (_07_Human) animal2; //자식타입 = (자식타입)부모타입;
			main3.readBook(); //사람이 독서를 한다.
		}
		
		_07_Ainmal tiger = new _07_Tiger();
		tiger.move(); //호랑이가 네발로 움직인다
		
		if(tiger instanceof _07_Tiger) {
			_07_Tiger tiger2 = (_07_Tiger) tiger;
			tiger2.hunting();
		}
		
		
		_07_Ainmal eagle = new _07_Eagle();
		eagle.move(); //독수리가 하늘을 납니다.
		
	}
}
