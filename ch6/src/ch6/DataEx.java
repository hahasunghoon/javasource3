package ch6;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data(); //대문자로 시작하는 타입이면 주소가 넘어간다
		
		//초기화 
		data.x = 10;
		System.out.println("main() : x = "+data.x);
		 
		//값만 넘어감    . < 점만 찍었을때 값만 넘어감
		change(data.x); //호출
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x);
		
		//주소가 넘어감
		change2(data); //호출
		System.out.println("After change2(data.x)");
		System.out.println("main() : x = "+data.x);
		
	}
	
	   //기본형 매개변수(int) : 값만 받게 됌
	   //int x : x가 가지고 있는 값만 받음
	   static void change(int x) { //스택이라는 단어가나오면 입/출구가 같다.
		   x =1000;
		   System.out.println("change(): x = "+x );
	   }
      
	   //참조형 매개변수 : 값을 읽고 수정 가능
	   static void change2(Data d) {
		   d.x =1000;
		   System.out.println("change(): x = "+d.x );
	
	   }
}
