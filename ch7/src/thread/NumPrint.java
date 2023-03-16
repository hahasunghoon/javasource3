package thread;

//implements Runnable 적기 , 밑줄생기면 add
public class NumPrint implements Runnable{

	@Override
	public void run() {
		for(int i=1; i <6; i++) {
			System.out.println(i);
		}
		
	}
	

}
