package ch01;

public class _03_VariableEx_ {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		
		//문자에 해당하는 정수값(아스키코드값) 출력 : 인코딩
		System.out.println((int)ch1); //65
		
		char ch2 = 66;
		System.out.println("ch2: " + ch2); //B
		//정수값에 해당하는 문자출력 : 디코딩
		
		int ch3 = 67;
		System.out.println("ch3: "+ch3); //67
		
		System.out.println((char)ch3); //C
		
		int ch4 = 'a';
		System.out.println((int)ch4);
		
		int ch5 = 'z';
		System.out.println((int)ch5); //122
		
	}

}
