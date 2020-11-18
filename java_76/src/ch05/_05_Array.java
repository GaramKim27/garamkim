package ch05;

public class _05_Array {
	public static void main(String[] args) {
		
		int[][] arr = {
					  {1, 2, 3} //0행
					 ,{4, 5, 6} //1행
					  };
		
		for(int i=0; i<2; i++) { //행 -> i<배열의 길이  (0열)1,(1열)2,(2열)3 / 1행 (0열)4,(1열)5,(2열)6
			System.out.println();
			for(int j=0; j<3; j++) { //열 -> ㅓ<행의 길이  (0열), (1열), (2열)
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		
		System.out.println("============================");
		
		for(int i=0; i<arr.length; i++) { //행 -> i<배열의 길이  (0열)1,(1열)2,(2열)3 / 1행 (0열)4,(1열)5,(2열)6
			
			for(int j=0; j<arr[i].length; j++) { //열 -> ㅓ<행의 길이  (0열), (1열), (2열)
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
	}
}
