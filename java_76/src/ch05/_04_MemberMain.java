package ch05;

public class _04_MemberMain {
	//3명의 member 정보를 배열로 출력 과제!
	public static void main(String[] args) {
		_04_Member[] mem = new _04_Member[3];

		mem[0] = new _04_Member("김가람", 27, "garam6500@", "인천");
		mem[1] = new _04_Member("김가람", 27, "garam6500@", "인천");
		mem[2] = new _04_Member("김가람", 27, "garam6500@", "인천");
		
		for(int i = 0; i < mem.length; i++) {
			mem[i].showInfo();
			System.out.println("========================");
		}
	}

}
	