package ch06;

// 자식클래스
public class _07_Human extends _07_Ainmal{
	
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("사람이 독서를 한다.");
	}
	
}
