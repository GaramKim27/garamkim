package ch02;

public class _12_WhileEx {
	public static void main(String[] args) {
		
		//TEST3
		//1.초기값
		int dan = 2;
		int i = 1;
		int a = 1; // =?
		System.out.println("*** 2단 ***");
		//2.조건식
		while(i < 10) {//i가 증가하므로..
			a = dan*i; //3.증감식 2*1,2*2...
			System.out.println(dan + "*" + i  + "=" + (dan * i));
			i++; 
		}//반복하기때문데 }안에 출력
		System.out.println("=========================");
		
		//1.초기값
				int ban = 3;
				int q = 1;
				int w = 1; // =?
				System.out.println("*** 3단 ***");
				//2.조건식
				while(q <= 9) {//i가 증가하므로.. 1~9 가지
				//3.증감식
					w = ban*q; // 2*1,2*2...
					System.out.println(ban + "*" + q  + "=" + w); //두가지 출력방법
					q++;
				}
				
				
				
	}
				
}
