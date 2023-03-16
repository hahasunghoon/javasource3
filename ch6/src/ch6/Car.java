package ch6;

public class Car {
      //속성(property) : 멤버 변수
	  //제조사,모델,색상,최대속도.....
	 String company;
	 String model;
	 String color;
	 String maxSpeed;
	 
	
	
	//기능(function) : 메소드
	//전진한다. 후진한다.
	 void forward() {
		 System.out.println("전진한다. ");
	 }
	 void backward() {
		 System.out.println("후진한다. ");
	 }
}
  //클래스 구성요소
  //멤버변수 - 속성
  //메소드 - 기능
  //생성자 - 인스턴스 초기화 담당 ★
    //1) 매개변수가 없는 생성자(기본생성자)
    //2) 매개변수가 있는 생성자
