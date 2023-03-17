package util;

public class Test {

	private String name;
	private int no;
	private String tel;
	
	public void print() {}
	public int sum() {
		return 0;
	}
	
	
	private Test(String name, int no, String tel) {
		super();
		this.name = name;
		this.no = no;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", no=" + no + ", tel=" + tel + "]";
	}

	

}
