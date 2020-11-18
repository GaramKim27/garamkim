package ch02;

import java.util.Scanner;

public class _15_DoWhileEx {
	public static void main(String[] args) {
		//월입력[1~12] : 입력월출력
		//범위초과(12보다 크거나, 1보다 작으면) +> ~월은 잘못된 월입니다. 다시입력하세요.)
int month = 0;
		
		System.out.println("월을 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		do {
			month=scan.nextInt();
			if(month>12 || month<1) {
				System.out.println("월은 잘못된 월입니다.");
				System.out.println();
				System.out.println("다시 월을 입력하세요");
			}
		}while(month>12 || month<1);
		
		System.out.println(month + "월입니다.");
		
		scan.close();
	
	}	

}
