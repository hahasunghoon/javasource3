package ch4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class WhileEx2 {

	public static void main(String[] args) {
	    //while 바꾸기
		//구구단 출력
		//6단출력
		int i=1;
		while (i<10) {
			System.out.printf("6 * %d = %d\n",i,(6*i)); //여기까지쓰면 무한루프빠짐
			i++;
			
		}
	  //while문으로
		int sum=0, j=0;
		
		while (true) {
			if(sum > 100) break;
			++j;
			sum+=j;
	}
	System.out.println("j="+j);
	System.out.println("sum="+sum);
	
	}
	
}
