package practice;

public class Member1 {
	
	private String name;

	Member1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member1 [name=" + name + "]";
	}
	
	
	

}