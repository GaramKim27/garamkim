package test;

public class _05_Kukudan_For {
	public static void main(String[] args) {
		
	
		int dan;
		int times;
		System.out.println( "                구구단을 외자~");
		System.out.println("=======================");
		for(dan = 3; dan <= 9;dan++){
			System.out.println("========= " + dan + "단  ========="); 
			for(times = 1; times <= 9; times++) { 
				System.out.println(dan + " X " + times + " = " +(dan * times)); // 
			}
			System.out.println("======================");
			System.out.println();
			//대소문자오타, 세미콜론.. 빼먹지않겠습니다....
			
		}
	}
}