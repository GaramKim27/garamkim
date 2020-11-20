package ch06;
//부모클래스
public class _02_Car {

	//멤버변수
	private String kind;
	private int speed;
	//생성자
	public _02_Car() {}
	
	public void setKind (String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}	
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}	
	
	//멤버메서드
	public void locate() {
		System.out.println("전국");	
	}
	public void job() {
		System.out.println("공무원");	
	}
	
	
	protected void carInfo() {
		System.out.println("종류: " + kind + " 최대속도: " + speed);
	}
}
