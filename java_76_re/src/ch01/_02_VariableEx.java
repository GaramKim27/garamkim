package ch01;

public class _02_VariableEx {
	public static void main(String[] args) {
		/*
		 * 메서드명, 변수명은 소문자로시작한다.(cf. 클래스명은 대문자로 시작한다.)
		 * 변수 :데이터를 담는 그릇이며, 데이터의 저장과 창조를 위해 메모리공간을 할당받는다.
		 *     반드시 먼저 선언: 컴파일러는 변수의 저료형에 맞는 기억공간을 미리 확보
		 *     선언 : 자료형 변수형: 예)int age;
		 *     선언과 동시에 할당 : 자료형 변수형 = 초기화; 예) int age = 30;
		 *     
		 *1. 기본자료형(Primitive Type) : 실제값이 저장
		 *	 정수형 : byte(1바이트) - short(2바이트) - int (4바이트) - long(8바이트
		 *	실수형 : float(4바이트) - double(8바이트)
		 *  문자형 : char(2바이트)
		 *  부울형 : boolean(true/false)
		 *   
		 *2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값만 저장
		 *     클래스, 인터페이스, 배열
		 *
		 *3. 문자형 : String 클래스
		 * 
		 */
		System.out.println("=== 정수형 변수");
//		int num1 = 0;
//		num1= 10;
		int num1 = 10;
		int num2 = 20;
		
		long num3 = 12345678900l; // long형은 숫자뒤에 L이나 l을붙인다.
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		
		
//		int num2 = 0
//		num2 = 20;
		System.out.println("========== char형 변수");
		char ch1 = ' '; //char형은 ' '으로 초기화(공백주기)
		ch1 = 'C'; // char형은 ch2를 'C'로 초기화, 같은변수는 선언을 한번만한다
		System.out.println("ch1 : " +ch1);
	
		
		System.out.println("========== 문자형 변수");
		String name1 = ""; // String초기화시 공백없어도됨
		name1 = "김가람"; // String은 클래스이므로 대문자로 시작
		System.out.println("name1: " + name1);
		
		System.out.println("========== 실수형 변수");
		float fnum1 = 3.14f; // float형은 값뒤에 F나 f를 붙인다.
		double dnum1 = 3.14; // double형은 기본형이며, 생략
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		
		System.out.println("============= 부울형 변수");
		boolean isMarried = false;
		System.out.println("isMarried : " + isMarried);
		
	}

}
