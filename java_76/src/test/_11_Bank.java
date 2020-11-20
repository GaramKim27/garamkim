package test;

public class _11_Bank {

	private String bankName; //은행명
	private String acco;   //계좌번호
	private int deposit;   //예금
	private int withdraw;   //출금
	private int balance;   //잔고
	private int rate; //이율
	
	//디폴트생성자
	public _11_Bank (){}

	//매배변수 생성자
	public _11_Bank (String bankName, String acco, int deposit, int withdraw,  int balance, int rate){
		System.out.println("부모 매개변수 생성자");
		System.out.println("==================");
		this.bankName = bankName ;
		this.acco = acco ;
		this.deposit = deposit ;
		this.withdraw = withdraw;   ;
		this.balance  = balance;   ;
		this.rate  =  rate ;
	}	
	//get set
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	public  String getBankName(){
		return bankName;
	}
	public void setAcco(String acco){
		this.acco = acco;
	}
	public String getAcco(){
		return acco;
	}

	public void setDeposit(int deposit){
		this.deposit = deposit;
	}
	public int getDeposit(){
		return deposit;
	}

	public void setWithdraw (int withdraw)  {
		this.withdraw    = withdraw;   
	}
	public int getWithdraw(){
		return withdraw;
	}

	public void setBalance  (int balance)   {
		this.balance   = balance;   
	}
	public int getBalance()   {
		return balance;   
	}

	public void setRate (int rate) {
		this.rate  = rate ;
	}
	public int getrate() {
		return rate;
	}


	public void printInfo(){	
	System.out.println("이름 : " + bankName );
	System.out.println("계좌번호 : " +acco );
	System.out.println("예금 : " + deposit);
	System.out.println("출금 : " + withdraw );
	System.out.println("잔고 : " + balance);
	System.out.println("이율 : " + rate );
	
	}
}
