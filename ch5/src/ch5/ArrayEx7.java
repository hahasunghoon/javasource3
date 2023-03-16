package ch5;
/* 참조 타입에서 특정한 값이 할당되지 않은 상태 : null...
 * String : char 배열에 기능을 추가한 개념
 * 
 * 
 */

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		
		//int aumArr[]=new int[3];
		
		String name[] = new String[3]; //대문자 시작 참조타입
		
		
		//System.out.println(name[0]); //여기까지 출력했을때 null 출력된다
		                                                    //null = 어떤값이 할당이 안된상황
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//초기화
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
		
		String str = "ABCDE";
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//문자열 비교 == 을 사용하지않는다 ★
		// equals(), equalsIgnoreCase() : 대소문자 무시하고 비교
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.println(str.equals("abcde")?"일치함" : "일치하지 않음");
		
		
	}

}


