package ch06;

public class _04_EmployeeMain {
	public static void main(String[] args){
		/*
		 * 자식 매개변수 생성자 호출 -> 값들을 한꺼번에 설정
		 */
		_04_Manager mm1 = new _04_Manager();//자식 디폴트생성자 호출
		_04_Manager mm2= new _04_Manager ("m001", "김가람", "객실부", 200, 100); // 1.자식 매개변수 생성자호출
		mm2.printInfo();
		
		System.out.println("===================");
		
		_04_Sawon mm3 = new _04_Sawon("m0012", "김가람", "판촉부", 300, 25);
		mm3.printInfo();
		
	}
}
