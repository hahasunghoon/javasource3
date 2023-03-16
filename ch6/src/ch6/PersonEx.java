package ch6;

public class PersonEx {

	public static void main(String[] args) {
		//Person 인스턴스가 생성됌 => Person 가지고 있는 인스턴스
		Person p = new Person(); //다른클래스에선 무조건 new
		p.setName("하성훈");
		p.print();
		
		
	//print2를 불러보자 static메소드를 부를땐 클래스.?
		
		Person.print2();

	}

}
