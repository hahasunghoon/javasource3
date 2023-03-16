package ch4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*중첩 for
 * for문 안에 for문 포함
 */
public class WhileEx1 {

	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
	System.out.println();
	//1) 바깥 for int 1=1;
	//2) i < 6;
	//3) 블럭안 시작 안쪽 for . int=j=0;
	//4)j < 10;
	//5)System.out.print("*");
	//6)j++ 실행 j=1
	//7)j <10; 실행됌
	//8)System.out.print("*");
	//9) 6)~8) 반복됌
	//10) j가 10이되면 안쪽 for 거짓이됌 ==> 안쪽 for 종료
	//11)System.out.println();
	//12) 다시 바깥 for i++실행됌 i=2가됌
	//13) i < 6 조건비교
	//14) 안쪽 for 문 10번 수행
	//15) 계속 반복되다가 바깥쪽 i가 6이되는 순간for문 종료
		for (int i=1; i < 6; i++) {
		for (int j=0; j < 10; j++) {
			System.out.print("*");
			  }
		System.out.println(); //엔터를 의미
	     }
	    //while문으로 바꾸기 컨트롤 스페이스바 3번째
	
		 
//		System.out.println(i);
		//*
		//**
		//***
		//****
		//*****
			
		for (int i = 1; i <=1; i++) {
			System.out.print("*");
			}
		System.out.println();
		
		for (int i = 1; i <=2; i++) {
			System.out.print("*");
			}
		System.out.println();
		
		for (int i = 1; i <=3; i++) {
			System.out.print("*");
			}
		System.out.println();
		
		for (int i = 1; i <=4; i++) {
			System.out.print("*");
			}
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			System.out.print("*");
			}
		System.out.println();
		
		//반복 적인걸 이중 for문으로 바꾸면
		
		System.out.println();
		//이중 for 문
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
	//4x+5y=60의 모든 해 구하기
	//단, x,y는 10이하의 자연수
	// 4*1+5*1=60
	// 4*1+5*2=60
	// 4*1+5*3=60
	// 4*1+5*4=60.....
	
	//4*2+5*1=60
	for (int i = 1; i <=+ 10; i++) {
		for (int j = 0; j <=10; j++) {
			// 60이 나오는 x,y 출력
			if(4*i+5*j==60) {
				System.out.printf("(%d, %d)\n",i,j);
			}
			
		}
		
	}
             int treeHit = 0;
             while (treeHit<10) {
            	 treeHit++;
            	 System.out.println("나무를 "+ treeHit + "번 찍었다");
            	 if (treeHit == 10) {
            		 System.out.println("나무가 넘어갑니다");
            	 }
				
			}
	}
}
