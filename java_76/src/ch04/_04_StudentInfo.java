package ch04;

public class _04_StudentInfo {
	//멤버변수 //실행순서3 -> setter로 전달받은 값을 보관
	private String studentID;
	private String studentName;
	private int score;
	//디폴트 생성자
	public _04_StudentInfo() { //setter로 값을 초기화
		System.out.println("디폴트생성자");
	}
	//매개변수 생성자 -> 멤버변수를 초기화하는 역할
	public _04_StudentInfo(String studentID, String studentName, int score) {
		System.out.println("매개변수생성자");
		this.studentID = studentID;
		this.studentName = studentName;
		this.score = score;
	}
	//멤버메서드
	
	//setter -> 멤버변수를 초기화하는 역할
	
	//getter -> 가운데에서 getter 전달해주는것 = 여튼 값은 같음..
	
	//실행순서2 = 매개변수 -> 멤버변수로 값 전달
	public void setStudentID(String studentID) {
		this.studentID = studentID; // this = 현재클래스 (내자신)
	}
	// 실행순서4 -> 멤버변수의 값을 return 받음
	public String getStudentID() {//메서드
		return studentID;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	//출력
	public void printInfo() {
		//System.out.println("학번 : " + studentID ); 
		//System.out.println("이름 : " + studentName );
		//System.out.println("학점 : " + score );
		System.out.println("학번 : " + getStudentID());//이렇게도 가능!
		System.out.println("이름 : " + getStudentName());
		System.out.println("학점 : " + getScore());
	}
	
	
}
