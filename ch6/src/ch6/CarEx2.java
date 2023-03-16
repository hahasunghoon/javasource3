package ch6;

public class CarEx2 {

	public static void main(String[] args) {
		
		//객체 생성 시 생성자가 자동으로 호출 됌
		Car2 car = new Car2();
		System.out.println("제조사 "+car.company);
		System.out.println("모델명 "+car.model);
		System.out.println("색상 "+car.color);
		System.out.println("최대속도 "+car.maxSpeed);
		
		System.out.println();
		//매개변수가 있는 생성자 호출하면서 객체 생성
		//초기화 방식 1. 생서자 이용
		Car2 car2 = new Car2("기아","레이","white","200");
		System.out.println("제조사 "+car2.company);
		System.out.println("모델명 "+car2.model);
		System.out.println("색상 "+car2.color);
		System.out.println("최대속도 "+car2.maxSpeed);
	}

}
