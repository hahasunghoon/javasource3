package ch6;

public class Person {
	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
	}
	//name 매개변수에 값을 받아서
	//person이 가지고있는 name 인스턴스변수의
	//값을 변경
	public void setName(String name) {
		//name 이 공백이 아니고 null이 아닌것을 셋팅 할려면
		//공백 이거나 null이면 기본값을 하성훈
		if(name.equals("")|| name == null) {
			this.name = "하성훈";
		} else {
			this.name = name;
			
		}
		print();
	}
	 static void print2() {
		 Person p = new Person();
		 p.setName("");
		
		
		
	}
	
	
	
	
	
}
