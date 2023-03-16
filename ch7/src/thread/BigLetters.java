package thread;

//extends Thread 적기
public class BigLetters  extends Thread {
	//run 컨트롤 스페이스바
	@Override
	public void run() {
		//같이 수행할 코드 작성
		// a~z까지 출력
		
		for(char ch='A'; ch <='A'; ch++) {
			System.out.print(ch);
		}
		

		
	}

}
