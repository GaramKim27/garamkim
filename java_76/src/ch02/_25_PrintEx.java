package ch02;

public class _25_PrintEx {
	public static void main(String[] args) {
		
		// 문자열길이구하기
		// str의 길이 : str,length()
		// str,chatAt(i) == "n"
		// str 문자열 중에서 "n의 갯수 : count //n일때만 증가시키고 아니면 skip
		
		// 출력 : str의 길이 : 
		// 문장에서 발견된 n의 갯수 : 
		
		String str = "no pain, no gain";
		int count = 0;
		
		for(int i= 0; i < str.length(); i++ ) {
			if(str.charAt(i) != 'n') {
				continue; // 반복문에서 조건이 만족하지 않으면 아래문장으로 스킵하고, for문으로 올라가서 계속해서 반복한다.
				
			}
			count++;
		}
		System.out.println("str의 길이 : " + str.length() ); //15
		System.out.println("문장에서 발견된 n의 갯수 : " + count); //4
	}
}	
