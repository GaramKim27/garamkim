package ch01;

public class _05_VariableEx {
	public static void main(String[] args) {
		/*
		 * 형변환-1. p64
		 * 1. 자동적인 형변환(확대 형변환, 묵시적 형변환)
		 * 데이터가 손실되지 않거나, 손실이 제한적인 범위내에서 묵시적으로 형변환된다.
		 * 자료형이 다른 변수의 값을 할당하는 경ㅇ, 형변환을 생략할 수 있다.
		 * 
		 * 데이터 큰타입 = 데이터 작은타입; (예: float f =10; // f에 10.0이 대입
		 * 자료형이 다른 값을 연산하는 경우; (예: double d = 10.0 + 30; //double d = 10.0 + 30.0;
		 * 
		 * 
		 * 2. 강제적인 형변환(축소 형변환, 명시적 형변환)
		 *   명시적으로 형변환하는 것을 캐스팅(Casting)이라고 한다.
		 *   Casting은 생략할 수 없으며, 생략시 컴파일 에러가 발생하므로 반드시 명시적으로 형변환해야한다.
		 *   강제로 형변환해야하므로 데이터 손실 위험이 있다.
		 *   
		 *   데이터 작은 타입 = (작은 타입)데이트 큰 타입;
		 * 
		 * 
		 */
		
		System.out.println("형변환-1 예제");
		
		double d = 20; // 1. 자동적인 형변환(확대 형변환, 묵시적 형변환) : 데이터 큰타입 = 데이터 작은타입
		System.out.println("d" + d); // d: 20.0
		
		float f = 20.5f + 10; // 20.5f + 10.0f
		System.out.println("f:" + f);//f:30.5
		
		int i = (int) 10.5; // 2. 강제적인 형변환(축소 형변환, 명시적 형변환) : 데이터 작은 타입 = (작은 타입)데이트 큰 타입;
		System.out.println("i: " + i); // i : 10
		
		/*
		 * 형변환-2.
		 * 3. int(4바이트)보다 작은 자료형은 int형으로 형변환후 계산
		 *   예) byte + short -> int + int
		 *   
		 * 4. 두개의 피연산자중 표현범위가 큰쪽에 맞취서 형변환후 계산
		 * 
		 */
		System.out.println("형변환-2 예제");
		
		int ii;
		double ff;
		
		ii = 5 / 4; //int = int / int; => int ii = 1; //int/int는 int
		System.out.println("ii: " +ii); // ii:1
		
		ff = 5 / 4; //double = int / int; => double ff = 1; // 1.25가 1로 int/int는 int
		System.out.println("ff: " +ff); // ff:1.0
		
		// 형변환보다 ()안의 계산이 우선
		ii = (int) (2.5 + 3.3); // int ii = (int)(double + double); //(int)(5.8) = 5
		System.out.println("ii: " +ii);
		
		//ii = (int) 2.5 + 3.3; // 컴파일 오류 int + double이기때문에...
	
		ii = (int) 2.5 + (int) 3.3;
		System.out.println("ii: " +ii); // ii:5
		
		System.out.println("======================================");
		
		int gg = 1000000;
		int jj = 2000000;
		long ll = 2000000L;
		
		int e1 = gg * jj;
		System.out.println("e1: " + e1); //e1: -1454759936 // int형범위 (-21억~21억) 초과
		
		long e2 = gg * jj;
		System.out.println("e2: " + e2); //e2: -1454759936 // long형에 대입하기 전부터 연산결과가 int형을 초과
		
		long e3 = (long) (gg * jj);
		System.out.println("e3: " + e3); //e3: -1454759936 // long형으로 형변환하기 전부터 연산결과가 int형을 초과
		
		long e4 = (long) gg * jj; //long * int -> long * long -> long gg*jj먼저계산
		System.out.println("e4: " + e4); // e4: 2000000000000
		
		long e5 = gg * ll; //int * long -> long * long -> long
		System.out.println("e5: " + e5); // e5: 2000000000000
		
		float e6 = 1000000000L;
		System.out.println("e6: " + e6); // e6: 1.0E9
		
	}
}
