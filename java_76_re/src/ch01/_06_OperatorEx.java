package ch01;

public class _06_OperatorEx {
	public static void main(String[] args) {
		/*연산
		 * 1. 사칙연산자
		 * 
		 */
		System.out.println("=== 사칙연산자 예제 ===");
		
		int num1 = 8; //변수선언, 초기화
		int num2 = 4; //변수선언, 초기화
		
		int addR = num1 + num2;
		int subR = num1 - num2;
		int mulR = num1 * num2;
		int divR = num1 / num2;
		int modR = num1 % num2;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num1 + num2 " +addR);
		System.out.println("num1 - num2 " +subR);
		System.out.println("num1 * num2 " +mulR);
		System.out.println("num1 / num2 " +divR);
		System.out.println("num1 % num2 " +modR);
		
		/*
		 * 2.증감연산자
		 * 1)전위연산자 : y = ++x; ==> ++x; y = x;
		 *   1. x값을 1증가한 후 2. 증가값을 y에 대입한다.
		 * 
		 * 2)후위연산자 : y = x++; ==> y = x; x++; 
		 *   1. x값을 먼저 y에 대입한 후 2. x값을 증가시킨다. 
		 */
		System.out.println("=== 증감연산자예제 ===");
		
		int c = 5;
		int nextC = ++c; // 전위연산자 // ++c ==> c + 1
		
		System.out.println("c = " + c ); // c = 6
		System.out.println("nextC = " + nextC);// c = 6
		
		int d = 5;
		int nextD = d++; //후위연산자 // nextD = d++> nextD에  d를 대입, d를 1증가
		System.out.println("d = " + d); // d = 6
		System.out.println("nextD =" + nextD); // nextD = 5
		
		int e = 2, f = 3, result = 0;
		System.out.println(++e + --f * e--); // 3+2*3=9
		System.out.println("e = " + e ); // e = 2 //후위연산자 작동
		System.out.println("f = " + f ); // f = 2
		
		result = ++e + --f * e--;
		System.out.println("result = "+ result); // result = 6 (3+1*3)
		System.out.println("e = " + e ); // e = 2 // 후위연산잔로 작동
		System.out.println("f = " + f ); // f = 1
		
		/*
		 * 연산
		 * 3.관계연산자 : 같다(==), 같지않다(!=),>, <, >=(크거나같다), <=		 
		 * * 
		 */
		System.out.println("===관계연산자예제===");
		int c1 = 10;
		int c2 = 20;
		
		System.out.println("c1 == c2 :" + (c1 == c2)); //false
		System.out.println("c1 != c2 :" + (c1 != c2)); //true
		System.out.println("c1 > c2 :" + (c1 > c2));  //false
		System.out.println("c1 < c2 :" + (c1 < c2));  //true
		System.out.println("c1 >= c2 :" + (c1 >= c2)); //false
		System.out.println("c1 <= c2 :" + (c1 <= c2)); //true
		
		
		/*
		 * 4.복합연산자
		 * 
		 */
		System.out.println("===복합연산자예제===");
		
		int i = 5;
		i += 10;    //i = i + 10
		System.out.println("i = " + i); // i = 15
		
		i -= 10;    //i = i - 10
		System.out.println("i = " + i); // i = 5
		
		i *= 10;    //i = i * 10
		System.out.println("i = " + i); // i = 50
		
		i /= 5;    //i = i / 10
		System.out.println("i = " + i); // i = 5
		
		
		i %= 10;    //i = i % 10
		System.out.println("i = " + i); // i = 15
		
		
		/*
		 * 연산
		 * 5. 논리연산자 : 1이면 참, True, 0이면 거짓, False.
		 *    &&(논리곱) : x %% y ==> x와 y 모두참이면 참, 그렇지않으면 거짓
		 *    ||(논리합) : x || y ==> x와 y 중에서 하나만참이면 참, 모두거짓이면 거짓
		 * 
		 *
		 */
		System.out.println("=== 논리연산자 예제 ===");
		int z1 = 4, y1 = 5;		
		
			
		System.out.println((z1 == 4) &&  (y1 == 5)); //T && T ==> True
		System.out.println((z1 == 4) &&  (y1 == 10)); //T &F T ==> False
		
		System.out.println((z1 == 4) ||  (y1 == 7)); //T && T ==> True
		System.out.println((z1 == 8) ||  (y1 ==10)); //T && F ==> False
		
		/*
		 * 연산
		 * 6. 삼항연산자 : 항이 3개인 연산자를 의미한다.
		 *              조건식? 결과1 : 결과2;
		 *              조건식이 참이면 결과1을 수행하고, 거짓이면 결과2를 수행한다.
		 * 
		 * 
		 */
		// 6-1 삼항연산자
		// score 60이상이면 "합격", 그렇지 않으면 "불합격"을 result2 변수에출력
		int score = 10;
		
		//결과= 조건식 ? 결과1 : 결과2;
		String result2 = (score >= 60) ? "합격" : "불합격";
		System.out.println("result2 : "+result2);
	    
		// score 60이상이면 "합격", 60점미만 "불합격", 40점미만이면 "과락"을 result3 변수에출력
		String result3 = (score >= 60)  ? "합격" : (score < 40) ? "과락" : "불합격";
		System.out.println("result3 : "+result3);
		// score 80초과 "A" 7미만 "B" 60미만 C"
		
		int score2 = 81;
		
		String result4 = (score2 > 80) ? "A" : (score2 < 60) ? "C" : "B";
		System.out.println("result4 :" + result4);
		
		
		
		
		
		
	}
}
