package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		//티셔츠 관리
		//객체생성 => 생성자 자동 호출
		//The constructor GoodsStock() is undefined 엑박 뜨면 생성자가 없기때문
		GoodsStock goods = new GoodsStock("p123456", 150); // 매개변수를 가진 생성자 호출
		//초기화 어떻게할껀지 고민
		
		System.out.println("현재 재고수량"+goods.stockNum);
		
		//상품이 10개팔렸을때(재고수량이 감소)
		goods.subtractStock(); //호출
		
		

	}

}
