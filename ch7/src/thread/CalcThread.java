package thread;
//extends Thread 쓰기
public class CalcThread extends Thread{
	//run 오버라이딩
	@Override
	public void run() {
		for (int i = 0; i <300; i++) {
			System.out.println("|");
			
			for(int x=0; x<10000000; x++);
			
		}
	}

}
