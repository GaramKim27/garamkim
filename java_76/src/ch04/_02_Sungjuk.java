package ch04;

public class _02_Sungjuk {
	
	private int korNum;
	private int engNum;
	private int mathNum;
	private int total;
	
	public void setKorNum(int korNum) {
		this.korNum = korNum;
	}
	public void setEngNum(int engNum) {
		this.engNum = engNum;
	}
	public void setMathNum(int mathNum) {
		this.mathNum = mathNum;
	}
	
	public int getTotal(int korNum, int engNum,  int mathNum) {
		total = korNum + engNum + mathNum;
		return total;
	}
	
	public double getAvg() {
	double avg = total /3.0;
		return avg;
	}
	

	
}
