package ch5;

import java.util.Arrays;

/*기본타입-byte.char,short,int,long,float,double,boolean
 * 참조타입-String(클래스),배열, 외우기[stack ,heap]
 * 
 * 
 */
public class ArrayEx3 {

	public static void main(String[] args) {
	     //[] : 1차원 배열
		//[][] : 2차원 배열(행,열)
		//int[] score;
		int score[]= {100,88,100,100,90};
		
		//배열 총합과 평균
       int sum=0;
       float average=0f;
       
       for (int i = 0; i < score.length; i++) { //length 배열의 길이
    	   sum+=score[i];
		}
       // 478/5 = 95 ==> 95.0
       // 478/5.0 =>95.6 ==>95.6
       average = sum / (float)score.length;
       
       System.out.println("총합"+sum);
       System.out.println("평균"+average);
	
	   }
	}


