package ch04;

import java.util.Scanner;

public class _02_SungjukMain {
	public static void main(String[] args) {
		_02_Sungjuk sung = new _02_Sungjuk() ;
			
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요 : ");	
		int kor = sc1.nextInt();
		
		System.out.println("영어점수를 입력하세요 : ");	
		int eng = sc1.nextInt();
		
		System.out.println("수학점수를 입력하세요 : ");	
		int math = sc1.nextInt();
	
		
		System.out.println("*** 성적출력  ***");
		System.out.println(sung.getTotal(kor, eng, math));
		System.out.println(sung.getAvg());
		
		
	}
}
