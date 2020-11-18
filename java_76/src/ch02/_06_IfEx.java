package ch02;

import java.util.Scanner;

public class _06_IfEx {
	public static void main(String[] args) {
		/*
		 * 입장료
		 * 
		 * age : 나이 입력받는다
		 * charge : 요금
		 * grade : 단계
		 * 
		 * 1~8세 : grade가 "미취학아동", charge : 1000
		 * ~13세 : grade가 "초등학생", charge : 2000
		 * ~19세 : grade가 "청소년", charge : 3000
		 * ~64세 : grade가 "일반인", ADULT_CHARGE : 4000선언 ==> charge에 대입
		 * 65세 이상인경우 : "경로우대", ADULT_CHARGE의 20%할인 ==> charge에 대입
		 * 
		 * 출력형식 ==> 나이 : 7세이며, 미취학아동, 입장료 : 1000원
		 * 
		 */
		
		int age = 0;
		String grade ="";
		int charge = 0;
		final int ADULT_CHARGE = 4000; // 상수 => final : 변수 변경불가
		
		System.out.println("나이를 입력하세요.");
		
		Scanner d = new Scanner(System.in);
		age = d.nextInt();
		
		if(age <=8) {
			charge = 1000; grade = "미취학아동";
		}else if(age <=13) {
			charge = 2000; grade = "초등학생";
		}else if(age <=19) {
			charge = 2000; grade = "청소년";
		}else if(age <=64) {
			charge = ADULT_CHARGE; grade = "일반인";	
		}else {
			charge = (int) (ADULT_CHARGE*0.8); grade = "경로우대";
		}
		
		System.out.println("나이 : " + age + "세 이며, " +  grade + ", " + "입장료 : " + charge + "원" );
		d.close();
	}
}
