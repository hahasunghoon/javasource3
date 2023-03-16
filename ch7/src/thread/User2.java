package thread;
// extends Thread 상속
public class User2 extends Thread {
	//포함관계
	private Calculator cal;

	// 소스->유징
	public User2(Calculator cal) {
		super();
		this.cal = cal;
		setName("User2");
	}
	
	//run 오버로딩
	@Override
	public void run() {
		cal.setMemory(50);
	}
}
