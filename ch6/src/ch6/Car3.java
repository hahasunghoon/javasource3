package ch6;

public class Car3 {

	 String company;
	 String model;
	 String color;
	 String maxSpeed; // 대문자 선언 확인
	 

	 
	 public Car3() { //기본(default) 생성자 . [source] - [Generate Constructor from...]
			super();
		}
	 
	 //매개변수가 있는 생성자 , this 는 자기자신
	 public Car3(String company, String model, String color, String maxSpeed) {
		 super();
		 this.company = company;
		 this.model = model;
		 this.color = color;
		 this.maxSpeed = maxSpeed;
	 }
	 
	 
	  public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
//		this(company, model,color);
//		this.maxSpeed = maxSpeed; //이렇게 변환이 가능)
	}



	
	//기능(function) : 메소드
	//전진한다. 후진한다.
	 void forward() {
		 System.out.println("전진한다. ");
	 }

	void backward() {
		 System.out.println("후진한다. ");
	}

	//CarEx4
	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}








}
