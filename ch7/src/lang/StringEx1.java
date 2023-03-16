package lang; //매우중요

//String 클래스
//-변경 불가능한(immutable)클래스
// equals() : 값비교
//equalsIgnoreCase() : 대소문자 구별하지 말고 값 비교
public class StringEx1 {

	public static void main(String[] args) {
		//String 클래스의 동작 구현
		//문자열을 다루는 일이 많기 때문에 new를 사용하지않고도 인스턴스를 생성할수 있도록 되어있음
       //문자열 만들기 1)문자열 리터럴 지정 2)new사용하는 방식
		
		String str2 = "Hello"; //1) 문자열 리터럴 지정 : 문자열 재사용
		String str4 = "Hello";
		String str = new String("안녕하세요");// 2) new 사용
		String str3 = new String("안녕하세요");
//		str2 = str2+str;
		
		//문자열 비교
		//String 클래스에 equals 오버라이딩(값 비교) 되어있다
		System.out.println(str2.equals(str)); // 이걸 쓰자
		System.out.println(str2.equalsIgnoreCase(str)); 
		System.out.println(str == str3); //문자열 비교시는 = = 사용하면안된다.
		
		System.out.println(str2 == str4); //true
	}

}
