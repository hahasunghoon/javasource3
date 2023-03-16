package ch7;

//사용자 정의 예외작성
// 개발자만의예외 클래스를 작성할때 사용 = > Exception or RuntimeException 상속


public class MyException extends Exception { //extends 쓰고 Exception(java.lang)불러오기
	//소스 - >슈퍼클래스

	MyException() {
		super();
		
	}

	MyException(String message) {
		super(message);
		
	
	} 

	
}
