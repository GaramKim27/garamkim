package test;
	// 자식클래스
	public class _11_ShinhanBank extends _11_Bank {

	//멤벼변수
	private  String event; //값 : "금리인하" 

	// 디폴트생성자
	public _11_ShinhanBank () {}
	
	//매개변수 생성자에서 부모생성자로 값 넘기고 , 매개변수로 값전달
	public _11_ShinhanBank (String bankName, String acco, int deposit, int withdraw,  int balance, int rate, String event){
	super(bankName, acco, deposit, withdraw, balance, rate);
	this.event = event;
	System.out.println("자식 매개변수생성자");
	}
	
	//멤버메서드 set get
	public void setEvent(String event)  {
		this.event = event; 
	}
	public String getEvent()   {
		return event;  
	}
	//출력 : 재정의
	@Override
	public void printInfo(){
		super.printInfo(); //자식메서드 호출
			System.out.println("이벤트 : " + event);
	}
}
