package ch6;

public class Circle {
	//속성
	//반지름
	double radius;
	
	//오른쪽 마우스 누르고 소스 -> 
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	//기능
	//원의 넓이 구하기
	double getArea() {
		return radius * radius * 3.14;
		
	}

}
