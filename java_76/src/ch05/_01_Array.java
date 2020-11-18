package ch05;

public class _01_Array {
	public static void main(String[] args) {
		
		/*
		 * 배열(Array) : 같은 타입의 대량의 데이터를 저장할 수 있는 저장소이다.
		 * 방법1) 선언과 생성을 따로한다
		 * 		int[] score; //선언
		 * 		score = new int[갯수]; //생성
		 * 		score[index] + 값;
		 *
		 * 방법2) 선언과 생성을 동시에한다... 추천
		 * 		배열자료형[] 배열명 = new 배열자료형[배열갯수];
		 * 		배열명[index] = 값;
		 * 
		 * 방법3)	int[] score = new int[]{1,2,3,4,5}; // 갯수 생략
		 * 		오류) int[] score = new int[5]{1,2,3,4,5}; []에 갯수가 있으므로 오류발생
		 * 		int[] 배열명;
		 * 		배열명= new 자료형[] {값1, 값2, 값3..값n}; // new 자료형[] 생략시 오류발생
		 * 
		 * 방법4) 선언과 할당을 동시에 한다... 제일많이사용
		 * 		배열자료형[] 배열명 = {값1, 값2, 값3..값n};
		 * 
		 */
		
		
		// 배열자료형[] 배열형 = new 배열자료향[배얄갯수];
		// 배열명[index] = 값;
		
		int[] scores = new int [5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		for(int i = 0; i< scores.length; i++) { // scores.length; : 5
			System.out.println("scores[" + i + "] = " + scores[i]);			
		}
		
		
	}

}
