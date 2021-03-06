package ch02;

public class _10_WhileEx {
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
		
		// 출력 ==> Happy~~1,Happy~~2,Happy~~3,Happy~~4,Happy~~5,
		/*
		 * int num = 0; // num 을 초기화(1부터시작함..)
		
		
		   while (num < 5) { 
			  num++; // happy1씩 ++자동으로 증가한다. --자동으로 감소한다(시작값과 끝값을 하나씩 더함 6,2)
		
		
			System.out.print("Happy" + num + "~~"); // 반복문안에 출력이 있어야 반복을하지!!!
		 */
	   
		// 출력 ==> Happy~~5,Happy~~4,Happy~~3,Happy~~2,Happy~~1,
		
		int k = 6; //1. 시작값. num 을 초기화(1부터시작함..)
		
		
		while (k >= 2) { // 2. 조건식
			k--; //3. 증감식 happy1씩 ++자동으로 증가한다. --자동으로 감소한다(시작값과 끝값을 하나씩 더함 6,2)
		
		
			System.out.print("Happy" + k + "~~"); // 반복문안에 출력이 있어야 반복을하지!!! print(빈줄삽입)
		}
	}	
}
