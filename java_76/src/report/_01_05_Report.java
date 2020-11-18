package report;

public class _01_05_Report {
	public static void main(String[] args) {
		
		int a;
		int b; 
		int c;
		int d;
		int dia1;
		int dia2;
		
		for (dia1 = 1; dia1 <=6; dia1++) {
			if(dia1%2 == 0) {
				continue;
			}
			for (c = 2; c >= dia1/2; c--) {
				System.out.print(" ");
			}
			for (a = 1; a <= dia1 ; a++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
		
		for (dia2 = 1; dia2 <= 7; dia2++) {
			if(dia2%2 == 0) {
				continue;
			}
			for (d = 1; d <= dia2/2; d++) {
				System.out.print(" ");
			}
			for (b = 7; b >= dia2; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
