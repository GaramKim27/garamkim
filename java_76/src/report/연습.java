package report;

public class 연습 {
	public static void main(String[] args) {
	
		int dan;
		int times;
		
		System.out.println("        구구단을외자~");
		System.out.println("==============================");
		for(dan = 2; dan<=9; dan++) { 
			System.out.println("==========" + dan + " 단 ========="); 
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + " = " +(dan*times));
			}
			System.out.println("===============");
			System.out.println();
		}
	}
	

}
