package thread;
//extends Thread 쓰고
public class BarPrint extends Thread {
	
	//run 오버라이딩
	
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
			}
		System.out.println("소요시간 2 "+ (System.currentTimeMillis()-ThreadEx4.start));
	
	}

}
