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
public class ifex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
//		String result = input%2==0?"짝수":"홀수";
//		System.out.println(result);
		
		//if~else == 삼항연산자
		String result="";
		if(input%2==0) {
			result = "짝수";
		}else {
			result = "홀수";
			
		}
          //result cannot be resolved to a variable (변수 선언안했다)오류표시
		System.out.println(result);
	}

}
