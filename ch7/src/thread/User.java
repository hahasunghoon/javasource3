package thread;
// extends Thread 상속
public class User extends Thread {
	private Calculator cal;

	// 소스->유징
	User(Calculator cal) {
		super();
		this.cal = cal;
		setName("User1");
	}
	
	//run 오버로딩
	@Override
	public void run() {
		cal.setMemory(100);
	}
}
