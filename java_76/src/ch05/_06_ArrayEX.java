package ch05;

public class _06_ArrayEX {
	public static void main(String[] args) {
		
		/*
		 *  *** 성적표 ***
		 *  ========================
		 *  번호 국어 영어 수학 총점 평균 학점
		 *  ========================
		 *  1  100 100 100 300 100 A
		 *  1  90 90 90 270  90 A
		 *  1  70 70 70 210 70 C
		 *  1  100 100 100 300 100 A
		 *  1  100 100 100 300 100 A
		 *  ========================
		 *  과목합계 390 390 390
		 *  
		 *  평균 : 소수점 이하 둘재자리
		 *  2차원 배열 -> scores 2차원 배열 : 국, 영, 수 점수는 직접 주어진값
		 *  총점(sum), 평균(avg), 과목합계(korTot, engTot, mathTot)는 직접계산
		 */
		int sum = 0;
		float avg=0.0f;
		int korTot, engTot, mathTot;
		korTot=engTot=mathTot=0;
		int[][] scores = {
				{100, 100, 100},
				{90, 90, 90},
				{80, 80, 80},
				{70, 70, 70},
				{60, 60, 59}
							
		};
		System.out.println("************* 성적표 ****************");
		System.out.println("==================================");
		System.out.println("번호  국어    영어    수학    총점    평균   학점");
		System.out.println("==================================");
		
		for(int i=0; i<5; i++) {
			sum = 0;
			System.out.print(" " + (i+1) + " ");
			for(int j=0; j<3; j++) {
				System.out.print(scores[i][j]+ " ");
				if(j==0) korTot += scores[i][j];
				else if(j==1)engTot+=scores[i][j];
				else if(j==2)mathTot+=scores[i][j];
				sum += scores[i][j];
			}
			avg=sum/3.0f;
			System.out.printf(sum+ " " + "%6.2f ", avg);
			
			if(avg>=90) System.out.println("A");
			else if(avg>=80) System.out.println("B");
			else if(avg>=70) System.out.println("C");
			else if(avg>=60) System.out.println("D");
			else System.out.println("F");
		}
		System.out.println("=================================");
		System.out.print(" 과목합계   "+ korTot  + " " +engTot+ " "+mathTot);
		
	}
}
