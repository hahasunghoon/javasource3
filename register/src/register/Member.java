package register; // 제일먼

public class Member {
	//속성 -  아이디(id), 이름(name), 주소(address), 이메일(email), 나이(정수)
	//외부에서 접근 불가능하게 선언하기
	private String id;
	private String name;
	private String address;
	private String email;
	private String age;
	

	// 생성자(모든 속성을 초기화할수 있는 상태)
	private Member(String id, String name, String address, String email, String age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
	}


	public Member(String id2, String name2, String address2, String email2, int age2) {
		// TODO Auto-generated constructor stub
	}


	//get . set 메소드
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getAge() {
		return age;
	}
	
	
	public void setAge(String age) {
		this.age = age;
	}


	
	
	
	
	//toString
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age
				+ "]";
	}
	
	
	
}
