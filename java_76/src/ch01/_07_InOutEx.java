package ch01;

import java.util.Scanner;

public class _07_InOutEx {
	public static void main(String[] args) {


		// 두수의 합 구하기
		int x = 0; //첫번째숫자를 입력받아 저장
		int y = 0; //두번째숫자를 입력받아 저장
		
		
		// 클래스명 참조변수명 = new 클래스명();
		// 참조변수명은 주소값을 가지고 있다.
		
		Scanner input = new Scanner(System.in); //힙메모리에 객체를 생성하고, 그 주소값을 scan에 대입
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		
		// 참조변서명. 메서드;
		x = input.nextInt(); //콘솔에서 입력받은 첫번째 숫자를 읽어서 x에 저장
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = input.nextInt(); //콘솔에서 입력받은 첫번째 숫자를 읽어서 y에 저장
		
		
		int sum = x + y;
		System.out.println("sum:"+ sum);
		
		System.out.println("프로그램종료~~~");
		
		input.close(); //자원해제
		
		
	}

}
