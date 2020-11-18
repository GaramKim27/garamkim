package ch04;

public class PracInfo {
	private String studentID;
	private String studentName;
	private int score;
	
	public PracInfo() {
		System.out.println("디폴트생성자");
	}
	
	public PracInfo(String studentID,String studentName, int score) {
		System.out.println("매개변수생성자");
		this.studentID = studentID;
		this.studentName = studentName;
		this.score = score;	
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentID() {
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
	
	public void printInfo() {
		System.out.println("학번 : " + studentID );
		System.out.println("이름 : " + studentName );
		System.out.println("학점 : " + score );
		}
	 	//System.out.println("학번 : " +  getStudentID());
		//System.out.println("학번 : " + getStudentName());
		//System.out.println("학번 : " + getScore());
	
	

}
