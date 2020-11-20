package ch06;

public class _01_AnimalMain {
	public static void main(String[] args) {
		
		// Cat 자식클래스 정보출력
		_01_Cat cat = new _01_Cat();
		cat.cry();
		cat.setKind("고양이");
		cat.setLegs(4);
		cat.eat();
		cat.sleep();
		cat.play();
		cat.printInfo();
		
		System.out.println("==============");
		
		// Dog 자식클래스 정보 출력
		_01_Dog dog = new _01_Dog();
			dog.bark();
			dog.master();
			dog.cute();
			dog.setKind("강아지");
			dog.setLegs(4);
			dog.printInfo();
			dog.eat();
			dog.sleep();
			dog.play();
		
		
	}
}
