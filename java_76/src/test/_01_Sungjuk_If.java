package test;

import java.util.Scanner;

public class _01_Sungjuk_If{
	public static void main(String[] args){
	
	int score = 0;
	char grade = ' ';
	System.out.println("점수를 입력하세요 : ");

	
	Scanner d = new Scanner(System.in); 
	score = d. nextInt(); // 이쪽부분이 아직 완벽히 이해가 안됬습니다.. 그냥 외웠어요..ㅎㅎ
	
	if (score >= 90){
		grade = 'A';
	}else if (score >= 80){
		grade = 'B';
	}else if (score >= 70){
		grade = 'C';
	}else if (score >= 60){
		grade = 'D';
	}else {
		grade = 'F';
	}
	
	System.out.println("점수 : "+ score + "학점 : " + grade);
	d.close();
	}
}
