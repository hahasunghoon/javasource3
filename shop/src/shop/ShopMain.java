package shop;

public class ShopMain {

	public static void main(String[] args) {
		
		IShop shop = new Myshop();
		
		//shop 이름 지정
		shop.seTitle("MyShop");
		//user 생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		// shop 시작
		shop.start();

	}

}
