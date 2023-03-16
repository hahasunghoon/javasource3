package shop;

public class User {
	private String name;
	private PayType payType;
	//소스->파일 . /소스 ->게터스베터스
	User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	
	

}
