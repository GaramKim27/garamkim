package ch02;

public class _17_ForEx {
	public static void main(String[] args) {
		/*
		 * 반복문
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
		
		
		int num;
		int sum;
		//GoodLuck1~~ GoodLuck2~~ GoodLuck3~~ GoodLuck4~~ GoodLuck1~~5
		for(num = 1; num <=5; num++) {
			System.out.print("GoodLuck~~" +  num  + " ");
		}	
		//GoodLuck5~~ GoodLuck4~~ GoodLuck3~~ GoodLuck2~~ GoodLuck1~~1
		for(num = 5; num >=1; num--) {
			System.out.print("GoodLuck~~" +  num  + " ");
		}
		
		
	}
}
