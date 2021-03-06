package ch02;

public class _11_WhileEx {
	public static void main(String[] args) {
		/*
		 * 반복문 : 조건식이 참인 동안 반복하라(	while, for문)
		 * 	      초기값 -> 조건식 -> 증감식
		 * 
		 * 초기값
		 * while(조건식) {
		 * 	     수행문1;
		 *    수행문2;...
		 *    증감식;
		 *}
		 *수행문3;    
		 *    
		 */
		
		//예제1. 1~10까지 출력 (1 2 3 ...10)
		
		int num = 1; //초기값 1부터 시작
		
		while(num <= 10){
			System.out.print(num + " " );
			num++;// 출력을 하고 1씩 증가하므로 출력값아래에 증감식을 넣는다.
		}
		System.out.println();//예제1 끝나고 한칸띄어서 예제2값을 출력하기위한 수단
		
		// 예제2. 1~10까지 합계출력 ==> 55
		
		int j = 1;
		int sum = 0;
		
		while(j <= 10) {
			sum += j; //더해서 대입해라
			j++;
		}
		System.out.print("1부터10까지의 합계 " + sum);
	}
}
