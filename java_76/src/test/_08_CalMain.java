package test;

public class _08_CalMain {	
	public static void main(String[] args) {
		
	_08_CalInfo printInfo = new _08_CalInfo();

	int num1 = 20;
	int num2 = 10;

	
	System.out.println("두수의 합은 : " + printInfo.getTotal(num1,  num2));
	System.out.println("두수의 평균 : " + printInfo.getAvg(num1,  num2));
	
	//return  result부분이 아직 헷갈려서 반복작업해봐야할거같습니다...

	}
}