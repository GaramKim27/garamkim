package ch02;

import java.util.Scanner;

public class _05_IfEx {
	
		public static void main(String[] args){
		
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요 : ");
         
	
		Scanner d = new Scanner(System.in); 
		score = d.nextInt(); // 이쪽부분이 아직 완벽히 이해가 안됬습니다.. 그냥 외웠어요..ㅎㅎ
		
		// 100보다 큰경우, 0보다 작은경우 ==> 잘못된 점수입니다. 다시입력하세요.!!
		// || : 논리함 ==> or(또는
		// && : 논리곱 ==> and(이면서)
		if (score > 100 || score < 0){ 
			System.out.println("잘못된 점수입니다. 다시입력하세요.");
		}else {
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
			//항상수행
			System.out.println("점수 : "+ score + "학점 : " + grade);
		}
		
		
		
		d.close();
	}
}
