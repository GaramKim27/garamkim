package ch02;

public class _24_PrintEx {
	public static void main(String[] args) {
		/*
		 * printf (형식지정자, 값 또는 변수)
		 * - 형식지정자
		 * %d : 정수를 출력한다. 예)System.out.println("%d", 10);
		 * %f : 실수를 출력한다. 예)System.out.println("%f", 10); //실수 6자리
		 * %c : 한문자를 출력한다. 예)System.out.println("%c", 10);
		 * %s : 문자열를 출력한다. 예)System.out.println("%s", 10);
		 */
		double value = 1.0/3.0;
		System.out.println("value : " + value); // value : 0.333333333333
		System.out.printf("%f" ,  value);  //0.333333 ==> 기본 6자리"
		
		System.out.println();
//		System.out.printf("%전체자리수, 나머지자릿수.2f", value);  //자릿수 부족시 공백으로 채운다
		System.out.printf("%6.2f", value);  //0.33 //앞의 두자리가 공백으로 채워짐"
				
	    System.out.println();
		System.out.println();
			
				
				
	}
}
