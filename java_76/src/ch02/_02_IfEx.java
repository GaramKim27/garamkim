package ch02;

public class _02_IfEx {
	public static void main(String[] args) {
		/*
		 * * if - else -if - else문
		 * if(조건식1) { // 조건식1이 참인경우
		 *      수행문1;
		 * } else if (조건문2){  // 조건식2이 참인경우
		 *         수행문2;
		 * }else if (조건문3){  // 조건식3이 참인경우
		 *         수행문3;
		 * }else if (조건문4){  // 조건식4이 참인경우
		 *         수행문5;
		 * }else { // 위의 조건이 모두 해당되지 않는 경우 수행
		 * 수행문5;
		 */
		int num = -5; //(num)
		// 결과출력=> -5는 음수입니다.(양수/0/음수)
		if (num > 0) {
			System.out.println(num +"은(는) 양수입니다."); //은(는) 입니다
		}
		else if (num == 0) {
			System.out.println(num + "0입니다."); 
		}
		else {
			System.out.println(num +"은(는)음수입니다.");
		}
        // System.out.println(); 로 출력하지않는 간편한방법 (마지막에 출력만 한번해주면 된다)
		int num2 = 5; 
		String result = "";
		
		
		if (num2 > 0) {
			result = "양수";
		}
		else if (num2 == 0) {
			result = "0";
		}
		else {
			result = "음수";
			
		}
		System.out.println(num2 + "=" + result);

		
		
		
		
	}

}
