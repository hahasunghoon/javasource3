package ch4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class WhileEx4 {

	public static void main(String[] args) {
	   //while, math.random()사용
		//두개의 주사위를 던져 나오는 값을 (값1,값2) 형태로 출력하고
		//값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료
		
		while (true) { //true 붙으면 while 무조건 실행하라는 뜻
			int dice1=(int)(Math.random()*6)+1; //주사위는 계속던져야해서 dice에 1을 붙인다
			int dice2=(int)(Math.random()*6)+1; 
			
			System.out.printf("(%d, %d)\n", dice1,dice2);
			
			if(dice1+dice2 == 5 ) break; // 5가 나오기 싫으면 위로 올리면된다
			
		}
	
		//for, if 수행할문장이 하나라면 블럭을 생량할 수 있음
		
		//if(true) System.out.println("ture");
		
		//if(조건){
		// 수행할문장
		
//		if(true) {
//			System.out.println("true");
//			System.out.println("123");
//	          }
		}
	}
	

