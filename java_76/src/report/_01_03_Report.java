package report;

public class _01_03_Report {
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		for(b = 5; b>=1; b--) {
			for(a = 5; a>= b; a--) {
				System.out.print(" ");
			}
			for(c = 1; c <= b; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
