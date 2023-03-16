package ch4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할때 사용
 * 종류 : for(주로 사용), while, do-while
 */

public class ForEx3 {

	public static void main(String[] args) {
		//팩토리얼
		// 4!= 4*3*2*1
		
		//숫자입력받기
		//팩토리얼 구한 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 숫자입력");
		int num = Integer.parseInt(sc.nextLine());
		
		int fact=1; //곱셈 결과를 저장할 변수
		//fact=fact*4;
		//fact=fact*3;
		for (int i = num; i>=1; i--) {
			fact = fact*i; // fact*=1;
			}
		System.out.printf("%d! = %d",num,fact);
		
	}
	
}
