package ch02;

public class _13_WhileEx {
	public static void main(String[] args) {
		 /*문제 6
		 * //2단-9단 구구단 출력
		 * ------------
		 * -----2단-----
		 * ------------
		 * 2 * 1 = 2
		 * 
		 * ------------
		 * -----3단-----
		 * ------------
		 */
		
		//1.초기값
		
		//2.조건식
		//while() { 
		
			//s-1 초기값
		
			//s-2 초기값
			//while() {
			
			//s-3 초기값
		
		//3.증감식
		int dan = 2;
		int i = 1;
		int a = 0;
		System.out.println( "                구구단을 외자~");
		System.out.println("=======================");
		while(dan <= 12 ) {
			System.out.println("========= " + dan + "단  =========");
			while(i < 10) { 
			a = dan*i; 
			System.out.println(dan + " X " + i + " = " + a);
			i++; 
			}
			i = 1; // (증감식) while문은 반복작업끝나고 다시 초기화시켜줘야됨. 3단으로바낌.
			dan++;	// dan을 +1
		}
			
			
	}
}
