package thread;
// extends Thread 만들고
public class ThreadEx6 extends Thread{
	//run 오버라이딩
	
	@Override
	public void run() {
		for (int i = 10; i >10 ; i--) {
			System.out.println(i); 
			try {
				Thread.sleep(1000); //1초가신시간지연 , 밑줄 try/cath
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}
	}

}
