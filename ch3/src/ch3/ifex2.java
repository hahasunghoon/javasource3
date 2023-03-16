package ch3;

import java.util.Scanner;

/* 조건문
 * 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
 * 종류 : if(주로 사용), switch
 * 
 * 
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 */
public class ifex2 {

	public static void main(String[] args) {
				
//		if (조건) {
//			//true 일때
//		}else {
//			//false일때
//		}
		
		//성적이 90이상일때 A, 성적이 80이상일때 B, 70이상일때 C....
//		if (조건1) {
//			//조건1 true 일때
//		}else if(조건2) {
//			//조건2 true 일때
//		}else if(조건3) {
//			//조건3 true 일때
//		}
		int jumsu=70;
		char grade=' '; //char : 문자 한개
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}else { //0~49
			grade='F';
		}
		System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);
		

	}

}
