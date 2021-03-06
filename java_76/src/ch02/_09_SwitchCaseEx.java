package ch02;

import java.util.Scanner;

public class _09_SwitchCaseEx {
	public static void main(String[] args) {
		// Test2
		// 점수를 입력받아 성적계산
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
		
		Scanner d = new Scanner(System.in); 
		score = d.nextInt();
		
		if (score > 100 || score < 0){ 
			System.out.println("잘못된 점수입니다. 다시입력하세요.");
		}else {
			
			switch (score/10){ 
				case 10 : case 9 :
					grade = 'A';
					break;
				case 8 : 
					grade = 'B';
					break;
				case 7 : 
					grade = 'C';
					break;	
				case 6 : 
					grade = 'D';
					break;		
				default:
					grade = 'F';
					break;
			}	
			System.out.println("점수 : "+ score + "  학점 : "+ grade);
			d.close();
		}
		
	}
}



