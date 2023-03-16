package poly;

public class ProductEx2 {            // TV1 , Buyer2

	public static void main(String[] args) {
		//  구매자 인스턴스 생성
		Buyer2 buyer = new Buyer2();
		
		buyer.buy(new Tv1());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		//카트 정보출력
		buyer.summary();
		
	

	}

}
