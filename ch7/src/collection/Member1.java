package collection;

public class Member1 {
	
	private String name;
    //소스- >필드
	Member1(String name) {
		super();
		this.name = name;
	}
	
	//소스 - > 게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//소스 -> toString
	@Override
	public String toString() {
		return  name;
	}
	
	

}
