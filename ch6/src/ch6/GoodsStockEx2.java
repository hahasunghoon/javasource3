package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// 입력값으로 GoodsStock 인스턴스생성
		
		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("상품코드 >> " );
//		String code = sc.nextLine();
//		
//		System.out.println("재고수량 >> " );
//		int stockNum = Integer.parseInt(sc.nextLine()); 
//		
//		GoodsStock stock = new GoodsStock(code, stockNum);
//		System.out.println(stock);
		
		//3개의 상품에 대해서 인스턴스를 생성해야 한다면? => 배열로 가는게 편하다
		GoodsStock[] goods = new GoodsStock[3];
//		goods[0] = new GoodsStock("p1001", 200);
//		goods[0] = new GoodsStock("p1002", 150);
//		goods[0] = new GoodsStock("p1003", 200);
		//위 세줄의 코드를 입력값으로 변경
		
		for (int i = 0; i < goods.length; i++) {
			System.out.println("상품코드 >> " );
		    String code = sc.nextLine();
		    System.out.println("재고수량 >> " );
		    int stockNum = Integer.parseInt(sc.nextLine()); 
		    goods[i] =new GoodsStock(code, stockNum);
		    System.out.println("------------------------");
		    
		    	}
		
		//확인용
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
			
		}
		
		//향상된 for문
		for(GoodsStock stock:goods) {
			System.out.println(goods);
		}
	}

}
