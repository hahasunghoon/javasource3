package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		//인스턴스 생성
		//참조형 타입 변수명 = new 참조형 타입();
		Data d = new Data(); 
		d.x =10;
		Data d2 = copy(d); //주소  d.x값
		System.out.println("d.x ="+d.x);
		System.out.println("d.x ="+d2.x);

	}
	
	//int a =4;
	static Data copy(Data d ) {
		Data temp = new Data();
		//
		temp.x = d.x;
		return temp;
		
	}
	
	
	


}
