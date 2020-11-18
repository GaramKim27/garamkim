package ch02;

public class _20_ForEx {
	public static void main(String[] args) {
		/* 문제 5
		 * //2단-9단 구구단 출력
		 * 
		 * ------------
		 * -----2단-----
		 * ------------
		 * 2 * 1 = 2
		 * 
		 * ------------
		 * -----3단-----
		 * ------------
		 * 3 * 1 = 3
		 */
		//System.out.println( +"단");
		
		int dan;
		int times;
		System.out.println( "                구구단을 외자~");
		System.out.println("=======================");
		for(dan = 2; dan <= 9;dan++){// 2단-9단까지 반복
			System.out.println("========= " + dan + "단  =========");// === 2단 ===
			for(times = 1; times <= 9; times++) { // dan*tiems = 9가지증가한다
				System.out.println(dan + " X " + times + " = " +(dan * times)); // 
			}
			System.out.println("======================");
			System.out.println();
			// 과제 for 문을 이용해서 마름모로 별그리기.. 
			//주석에 결과이미지를 만들어라(5개)
		}
	}
}
