package ch05;

public class _07_EnFor {
	public static void main(String[] args) {
		
		/* p218
		 * -향상된 for문 ========> 중요
		 * 배열의 처음부터 끝까지 모든 요소를 참조할때 사용하는 반복문
		 * 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * 따로 초기화와 종료조건이 없기때문에, 모든 배열의 시작요쇼부터 끝 요소까지 실행한다.
		 * 
		 * 
		 * for(변수:배열) {
		 *    반복실행문
		 * }   
		 */
		                      //1
		String[] strArray = {"java", "jsp", "spring", "python", "javascript",};
		           //2     
		for(String language : strArray) {
			System.out.println(language);
		}                          //3 순서로 5회반복 많이사용!
	}
}
