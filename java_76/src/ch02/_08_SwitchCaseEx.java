package ch02;

public class _08_SwitchCaseEx {
	public static void main(String[] args) {
		/*  조건  : 조건식, 변수
		 *  Switch(조건){
		 * 	case 값1 : 수행문1;
		 * 			  break;
		 *  case 값2 : 수행문2;
		 * 			  break;
		 *  case 값3 : 수행문3;
		 * 			  break;
		 *  default : 수행문4;
		 */
		 
		 // 숫자 num 기준==> str : 하나, 두서넷, 대여섯, 많음
		 // 1 : 하나  2 : 두서넛  5 : 대여섯
		int num = 7;
		String str = "";
		
		switch(num) {
			case 1 : str = "하나";
				break;
			case 2 : case 3 : case 4 : str = "두서넛";
				break;
			case 5 : case 6 : str = "대여섯";
				break;
			default : str = "많음";
		
		}
		System.out.println(num + "은(는) " + str + "이다.");
		
	}
}
