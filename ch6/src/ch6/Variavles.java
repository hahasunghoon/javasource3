package ch6;

//선언 위치에 따른 변수의종류
//생성시기
//클래스 변수 : 클래스가 메모리에 올라갔을 때
//인스턴스 변수 : 인스턴스가 생성될때
//지역변수 : 변수 선언문이 수행되었을때
public class Variavles {
	int num;  //멤버변수(인스턴스 변수)
	static int cv; // 클래스변수 (static 변수, 공유변수)
	
	void method() {
		int lv = 0; //지역변수
	}
	

}
