package ch01;

public class _04_VariableEx {
	public static void main(String[] args) {
		/*
		 *  상수 : 프로그램이 실행되는동안 값이 변하지않는 수 또는 변경불가능한 수
		 *       final 키워드는 변수의 값이 대입되고 나면, 변수값이 더이상 변경되지 않는다는 의미
		 *       주로 대문자를 사용
		 *       만일 값변경시 상수를 선언한 부분의 값만 변경한다.
		 */
		final double PI = 3.14; // 상수선언 및 초기화.. 면접에 많이나옴.
		double val = 0.5;
		
		double result = PI * val;
	    System.out.println("result: "+ result);// 1.57
	    
	  //PI = 3.15; // 오류 : 상수는 final로 선언하면 변경불가
	    
	    System.out.println("================================");
	    
	 // 상수(MY_NAME, MY_AGE)를 이용하여 이름과 나이를 출력하시오
		
	 	final String MY_NAME = "김가람";
	 	final int MY_AGE = 27;
	 		
	 	System.out.println("이름: " + MY_NAME);
	 	System.out.println("나이: " + MY_AGE);
	}
}
