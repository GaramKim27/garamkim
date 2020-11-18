package ch02;

public class _18_ForEx {
	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 *  for문의 기본구조
		 *  
		 *  for(초기값; 조건식; 증감식;) {
		 * 
		 * 		수행문장1;
		 * 		수행문장2;
		 * }
		 * 
		 */	
		
		// 1~10까지의 합 : sum ==> 최종결과확인
		int num ;
		int sum = 0;
		for(num = 1; num <11; num++) { // = (int num = 1;, sum = 0; num <11; num++)
			sum += num; //sum = sum + num (누적)
		}
		System.out.println("1~10까지의 합 : " + sum);
		
		System.out.println("===================");
		
		// num=?, sum=? ==> 중간단계확인
		int a = 1;
		int b = 0;
		for(a = 1; a <11; a++) {
			b += a; // 
			System.out.println("num= "+a +" sum= " + b);
		}
	}
}
