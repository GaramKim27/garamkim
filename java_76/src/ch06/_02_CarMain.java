package ch06;

public class _02_CarMain extends _02_Car {
	public static void main(String[] args) {
		
		_02_Firecar fcar = new _02_Firecar();
		fcar.work();
		fcar.setKind("소방차");
		fcar.setSpeed(100);
		fcar.locate();
		fcar.job();
		fcar.carInfo();
		
		
		System.out.println("===================");
		
		_02_Policecar pcar = new _02_Policecar();
		pcar.siren();
		pcar.setKind("경찰차");
		pcar.setSpeed(200);
		pcar.locate();
		pcar.job();
		pcar.carInfo();
		
	}		
}
