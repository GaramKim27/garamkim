package ch05;

public class _03_BookMain {
	public static void main(String[] args) {
		_03_Book[] library = new _03_Book[5];
		
		library[0] = new _03_Book("자바의 정석", "김가람");
		library[1] = new _03_Book("자바의 기초", "김가람");
		library[2] = new _03_Book("자바의 매력", "김가람");
		library[3] = new _03_Book("자바는 극혐", "김가람");
		library[4] = new _03_Book("자바칩", "김가람");
		
		for(int i=0; i < library.length; i++) {
			library[i].showBookInfo();
			System.out.println("=============");
		}
		
	}
}