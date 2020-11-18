package test;

import java.util.Scanner;

public class _04_Kukudan_While {
	 public static void main(String[] args) {
	
	int dan = 0;
	int i = 1;
  	int s = 1;
  	Scanner w = new Scanner(System.in);
  	System.out.print("단을 입력하세요.");
  	dan = w.nextInt();
  	
	System.out.println("*** " + dan + "단 ***");
	
	while(i<10){
	s = dan*i;
	System.out.println(dan + "*" + i + " = " + s);
	i++;
	}
	System.out.print("==================");
	w.close();

    }
}

// 