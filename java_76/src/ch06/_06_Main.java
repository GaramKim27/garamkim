package ch06;

public class _06_Main {
	public static void main(String[] args) { //int a= 3;
		_06_Main main = new _06_Main();
		
		main.moveAnimal(new _06_Human());  //_06_Animal animal = new _06_Human(); //참조변수에 주소값전달
		main.moveAnimal(new _06_Tiger());	 //_06_Animal animal = new _06_tiger(); //참조변수에 주소값전달
		main.moveAnimal(new _06_Eagle());  //_06_Animal animal = new _06_ealge(); //참조변수에 주소값전달
	}
	
	// 매개변수에 다형성을 적용
	public void moveAnimal(_06_Animal animal) { //_06_Animal animal = new Human();
		animal.move(); //사람이 움직입니다.	대표자!!
	
		
	
		
		if(animal instanceof _06_Tiger) {
			_06_Tiger tiger = (_06_Tiger) animal;
			tiger.hunting();
		}
		else if(animal instanceof _06_Eagle) {
			_06_Eagle eagle = (_06_Eagle) animal;
			eagle.flying();
		}else if(animal instanceof _06_Human) {
			_06_Human human = (_06_Human) animal;
			human.readBook();
		}
		
	}
	
	
//	public void moveAnimal_human(_06_Animal animal) { //_06_Animal animal = new 자식();
//		animal.move(); //사람이 움직입니다.	
	}
//	public void moveAnimal_tiger(_06_Tiger tiger) {
//		tiger.move(); //호랑이가 네발로 뜁니다.
//	}
//	public void moveAnimal_eagle(_06_Eagle eagle) {
//		eagle.move(); //독수리가 하늘을 납니다.
//	}
	


/*
 * 자식클래스 참조변수명 = new 자식클래스();
		_06_Human hh = new _06_Human(); 
		hh.move(); //오버라이드 메서드이므로  자식메소드 호출
		hh.readBook();
		
		//            큰타입                 =      작은타입
		//다형성적용 : 부모클래스 참조변수명 = new 자식클래스();
		//메서드 갯수는 자식이 많으나 타입은 부모타입이 크다.
		//부모클래메서드 : 1개(설계도에 1개)   = 자식클래스 메서드 2개(힙메모리에 2개상성)
		_06_Animal hh2 = new _06_Human(); //Human의 디폴트생성자호출
		hh2.move();/*
 * 
 * 
 */


