package thread;

public class ThreadEx2 {
	// BigLetters,SmallLetters 둘다 돌아가게

	public static void main(String[] args) {
		
		Thread t1 = new BigLetters();
		SmallLetters t2 = new SmallLetters();
		
		//3번째
		//Runnable r =new NumPrint();
		//Thread t3 = new Thread(r); 
		Thread t3 = new Thread(new NumPrint());
		
		
		
		
		t1.start(); //반드시 불러야함
		t2.start();
		t3.start();

	}

}
