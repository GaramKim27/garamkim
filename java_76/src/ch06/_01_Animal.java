package ch06;

//부모클래스
public class _01_Animal {
	
	//멤버변수
	private String kind;
	private int legs;
	
	// 디폴트 생성자
	public _01_Animal() {
		
	}
	//멤버메서드
	public void setKind (String kind) {
		this.kind = kind;
	}
	public void setLegs (int legs) {
		this.legs = legs;
	}
	
	
	
	public void eat() {
		System.out.println("먹다");	
	}
	public void sleep() {
		System.out.println("자다");	
	}
	public void play() {
		System.out.println("놀다");	
	}
	
	public void printInfo() {
		System.out.println("kind : "+ kind + " legs : " + legs);
	}
	
}
