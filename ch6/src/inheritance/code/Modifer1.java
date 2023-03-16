package inheritance.code;

import modifier.Account;





public class Modifer1 {
	//참조타입은 null로 셋팅
//	String str =new String("Hello");
	String str="Hello";
	Account acc=new Account(); //the type modifier.Account is not visible(public 이 생략되면)
	
	int age;  //기본 타입은 정수형-0, 실수형-0.0; boolena-false으로 셋팅
	
	private void print() {
		 
		 System.out.println(acc.getAno());
		 System.out.println(str.length());
		 System.out.println(age);
		 
		 
		//Account가 가지고 있는 ano 접근하고 싶다면?
		String ano=acc.getAno();
		System.out.println("ano: "+ano);
		
		acc.setAno("111-222");
		System.out.println("ano :  "+acc.getAno());
	}
//main 컨트롤스페이스바
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출
		//1.같은 static으로만들기
		//2.객체 생성후 접근하기
		Modifer1 modifer1 = new Modifer1();
		modifer1.print();
		
	}
}
