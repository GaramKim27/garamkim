package test;

public class _11_BankMain{
	public static void main(String[] args){
	
	//_11_ShinhanBank : 매개변수 생성자로 값 전
	_11_ShinhanBank bb = new _11_ShinhanBank("신한은행", "110-12", 120, 100, 20, 1, "금리인하");
	bb.printInfo(); 
	
	System.out.println("==================");

	//_11_WooriBank : 기본생성자 setter로 값전달
	     // 자료형                                  생성형
	_11_WooriBank bb2 = new _11_WooriBank (); //인스턴스생성
	bb2.setBankName("우리은행");
	bb2.setAcco("1102-2");
	bb2.setDeposit(70000);
	bb2.setWithdraw(50000);
	bb2.setBalance(20000);
	bb2.setRate(21);
	bb2.setVipMember("vip");
	bb2.printInfo();
	}
}