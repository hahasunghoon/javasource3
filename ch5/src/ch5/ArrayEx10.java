package ch5;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		//사용자한테 답변을 받을 수 있도록 코드작성
		// 답과 비교할때 equals 서서 true인 경우 정답
		//                                         false인 경우 오답. 정답은 ~~~입니다.
		
		Scanner sc = new Scanner(System.in);
		String words[][]= {
				{"chair", "의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
				
				};
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d)%s 의 뜻은?\n", i+1, words[i][0]);
		}
		
		System.out.println(">>");
		// 답변 입력받기
		String answer = sc.nextLine();
		
		// 정답과 답변 비교
		if(answer.equals(words[0][1])) {
			System.out.println("정답");
		}else {
			System.out.printf("오답. 정답은 %s입니다", words[1][1]);
			
		}
		
		
	}
		
}


