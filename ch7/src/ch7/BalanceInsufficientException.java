package ch7;

public class BalanceInsufficientException extends Exception{

	private BalanceInsufficientException() { //소스->슈퍼클래스 기본,string만 체크
		super();
		
	}

	BalanceInsufficientException(String message) {
		super(message);
		
	}
	

}
