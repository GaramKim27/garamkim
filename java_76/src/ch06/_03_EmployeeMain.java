package ch06;

public class _03_EmployeeMain {
	public static void main(String[] args) {
		//	Sawon 자식클래스 정보출력
		_03_sawon ss = new _03_sawon();
		ss.setSabun("2016-510");
		ss.setName("김가람");
		ss.setDept("영업부");
		ss.setSalary(200);
		//자식메서드
		ss.setSudang(100);
		ss.printinfo(); //재정의된 자식메서드가 호출된다.
		
		System.out.println("==============");
		
		//Manager 정보출력
		_03_Manager mm =new _03_Manager();
		//부모메서드
		mm.setSabun("2012-14");
		mm.setName("김가람");
		mm.setDept("프론트");
		mm.setSalary(320);
		//자식메서드
		mm.setBonus(100);
		mm.printinfo(); //출력하라 : 재정의된 자식메서드
		
				
		
	}
	
}
