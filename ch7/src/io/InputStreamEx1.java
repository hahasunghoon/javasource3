package io;

import java.io.IOException;
import java.io.InputStream;

/*I/O(Input / Output)
 * Input : 키보드
 * Output : 화면
 * 
 * 스트림(Stream) :  한쪽에서 다른 쪽으로 데이터를 전달하기 위해, 두 대상을 연결하고 데이터를
 *                               전송할 수 있는 것
 * 1)바이트 기반 스트림 : 바이트 단위로 데이터 전송
 *                                  FileInputStream, FileOutStream...
 * 2)문자 기반 스트림 : 문자 기반 데이터 전송
 *                                 FileReader, FileWriter....
 * 
 */

public class InputStreamEx1 {

	public static void main(String[] args) {
		//input : 키보드
		InputStream in = System.in;
		
		//입력이 들어오면 읽어오기
		// in.read(); 빨간줄 클릭 서치
		try {
			//read() : 한 바이트만 읽어옴(읽어올 바이트가 없으면 -1 리턴)
			//             한글(3Byte)은 깨짐 , 영어 숫자는 상관없다
			//결과값은 하나인데 Ex)ABC 다 출력하고싶으면 반복문을 사용한다.(while)
		 int input = 0;
			while((input = in.read())!=-1) {//-1은 read가 더이상 읽어올게 없으면 쓴다.
				
				System.out.println((char)input);
			
		     } 
		
		}	catch (IOException e) {
			e.printStackTrace();

	        }
		
	   }
}
