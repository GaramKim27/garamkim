package report;

public class _01_01_Report {
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		for(b = 5; b >=1; b--  ) {
			for(a = 1; a <=b; a++) {
				System.out.print(" ");
			}
			for(c = 5; c>=b; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
