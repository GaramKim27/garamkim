package ch02;

public class _22_ForEx {
	public static void main(String[] args) {
		/*
		 * continue문 예제
		 * continue문은  반복문과 함께 쓰인다.
		 * 반복문 안에서 continue문을 만나면, 그 이후의 문장은 수행하지않고,
		 * for문의 처음으로 돌아가 증감식을 수행한다.
		 *
		 * 
		 */
		//1~100까지의 홀수 합계 : total
		
		int total = 0;
		for(int num=1; num<=100; num++) {
			if(num%2 ==0) //2로나는 나머지
				continue;// 짝수일때 아래문장으로 수행하지않고 for문의 증감식을 수행한다.
			total += num;
		}
		
		System.out.println("1부터 100까지의 홀수의 합계: " + total); //2500
		
		 
	}
}
