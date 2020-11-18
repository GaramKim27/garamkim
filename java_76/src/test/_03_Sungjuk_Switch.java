package test;

import java.util.Scanner;

public class _03_Sungjuk_Switch {
	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';

		Scanner e = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		score = e.nextInt();

		if (score > 100 || score < 0) {
			System.out.print("잘못된 점수입니다. 다시 입력하세요.");
		} else {

			switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			System.out.println("점수 : " + score + " 학점 : " + grade);
			e.close();
		}

	}

}
