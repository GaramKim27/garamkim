package ch04;

public class PracMain {
	public static void main(String[] args) {
		
		PracInfo ss1 = new PracInfo();
		ss1.setStudentID("2012-16011");
		ss1.setStudentName("김가람");
		ss1.setScore(20);
		ss1.printInfo();
		
		System.out.println("=============");
		
		PracInfo ss2 = new PracInfo("2016", "이수하", 24);
		ss2.printInfo();
	}
}
