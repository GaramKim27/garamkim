package ch02;

import java.util.Scanner;

public class _04_IfEx {
	public static void main(String[] args) {
		/* 자바 API => https://docs.oracle.com/javase/8/docs/api/
		 * 변수에는 
		 * 1. 기초형(Primitive Type) : 실제값이 저장
		 * 		     - 데이터타입 변수명 = 값;
		 *             int score = 70;
		 *             
		 * 2. 참조형 (Reference Type) : 실제 객체를 가리키는 주소값이 저장
		 *         - 클래스, 인터페이스, 배열
		 *         - 클래스인경우
		 *         클래스명은 참조변수명 = new 클래스명();
		 *         참조변수명.멤버메소드;
		 *         참조변수명.멤버변수;
		 *         
		 *                     
		 *        예) Scanner scan = new Scanner (Systwm.in)
		 *          - 참조변수명에는 갹체(인스턴스)를 가리키는 주소값이 들어있다.
		 */
		
	
	/*
	 * 학점구하기
	 * 
	 * 1. 점수는 score 변수, 학점은 grade 변수
	 * 2. 점수가 90점이상이면 A
	 *    점수가 80점이상이면 B
	 *    점수가 70점이상이면 C
	 *    점수가 60점이상이면 D
	 *    점수가 60점미만이면 F
	 * 3. 결과 => 점수 : 80, 학점 : B
	 * 
	 */
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 : ");
		
		Scanner x = new Scanner(System.in); // 컨트롤 shift o
		score = x.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}else if (score >= 80 ) {
			grade = 'B';
		}else if (score >= 70 ) {
			grade = 'C';
		}else if (score >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		// 항상수행
		System.out.println("점수: "+ score + " 학점: "+ grade);
		x.close();	
			
    }
}
