package ch02;

public class _03_IfEx {
	public static void main(String[] args) {
		//score가 60점 이상이면 "합격" 60점미만이면 "불합격" 40점미만이면 "과락"을 result 변수에 출력
		int score = 40;
		String result = "";
		if (score >= 60){
			result = "합격";	
		}
		else if (score <= 40) {
			result = "과락";
		}
		else {
			result = "불합격";
		}
		System.out.println(score  + ":" +result);
	}

}
