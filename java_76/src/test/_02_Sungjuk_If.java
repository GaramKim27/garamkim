package test;

import java.util.Scanner;

public class _02_Sungjuk_If {
	 public static void main(String[] args) {

	int score = 0;
    char grade = ' ';

	Scanner d = new Scanner(System.in);
	System.out.print("점수를 입력하세요.");
	score = d.nextInt(); // Scanner 입력하는 순서가 아직 헷갈립니다..

 	if (score > 100 || score <0){
		System.out.print("잘못된 점수입니다. 다시 입력하세요.");
	}else if(score >= 90) {
		grade = 'A';
	}else if(score >= 80) {
		grade = 'B';
	}else if(score >= 70) {
		grade = 'C';
	}else if(score >= 60) {
		grade = 'D';
	}else { 
		grade = 'F';
	}
	System.out.print("점수 : " + score +  " 학점 : " + grade);
	d.close();
     }

}	

// 전체적으러 오타가 좀 일어나서 줄이도록하겠습니다.