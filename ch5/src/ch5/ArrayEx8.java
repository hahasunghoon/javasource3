package ch5;
/* 참조 타입에서 특정한 값이 할당되지 않은 상태 : null...
 * String : char 배열에 기능을 추가한 개념
 * 
 * 
 */

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayEx8 {

	public static void main(String[] args) {
		//2차원 배열
		
		int[][] score = new int[4][3]; //4행 3열
		int[] score2[] = new int[2][3]; //2행 3열
		int score3[][] = new int[5][2]; //5행 2열
		
		//[행번호] [열번호] 순
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//2차원 길이 : 행길이
		System.out.println("길이 "+score2.length);
		System.out.println("열길이 "+score2[0].length);
		
		for (int i = 0; i < score2.length; i++) { //score2.length 는 행길이
			for (int j = 0; j < score2[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
				
			}
				System.out.println();
			}
			//2차원 배열 선언, 생성, 초기화 한번에 하는
		int[] score4[] = {
				{10,11,12},
				{20,21,22}
		};
	        //향상된 for 2차원 배열 접근
		for(int arr[] : score4) {
			for(int j : arr) { //10,11,12 를 돌리겠다라는 의미
				System.out.printf("%dt",j);
			}
			System.out.println();
		}
		
	}
		
	}




