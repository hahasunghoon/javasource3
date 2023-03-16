package poly;

public class Product {
	int price;
	int bonusPoint;
	
	public Product() { // Pro 컨트롤 스페이스바
		// TODO Auto-generated constructor stub
	}
	
	
	//소스-> 파일 -> price만 체크
	 protected Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
	
	

}
