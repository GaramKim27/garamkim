package ch02;

public class _01_IfEx {
	public static void main(String[] args) {
		/*
		 * if - else -if - else문
		 * if(조건식1) { // 조건식1이 참인경우
		 *      수행문1;
		 * } else if (조건문2){  // 조건식2이 참인경우
		 *         수행문2;
		 * }else if (조건문3){  // 조건식3이 참인경우
		 *         수행문3;
		 * }else if (조건문4){  // 조건식4이 참인경우
		 *         수행문5;
		 * }else  (조건문5){  // 조건식5이 참인경우 // 위의 조건이 모두 해당되지 않는 경우 수행
		 * 수행문5;
		 */
		
		int age = 5;
		// 8살이상이면 "학교에다닌다."출력, 그렇지 않으면 "학교에 다니지 않는다." 출력
		if(age >= 8 ){
			System.out.println("학교에 다닌다.");
		} else {
			System.out.println("학교에 다니지않는다.");
		}
    }	
}
