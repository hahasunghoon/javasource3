package ch6;

public class CardEx {

	public static void main(String[] args) {
		//공통속성 지정
		Card.widh = 50;
		Card.height =80;
		System.out.println("Card width= " +Card.widh);
		System.out.println("Card height= " +Card.height);
		
		
		
		Card card1 = new Card();
		card1.kind ="Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 4;
		
		System.out.printf("card %s, number=%d, 크기는 (%d, %d)\n",
				card1.kind,card1.number,Card.widh,Card.height);
		
		System.out.printf("card %s, number=%d, 크기는 (%d, %d)\n",
				card2.kind,card2.number,Card.widh,Card.height);
		
		//전체 카드의 크기변경
		System.out.println();
		Card.widh =60;
		Card.height =90;
		
		System.out.printf("card %s, number=%d, 크기는 (%d, %d)\n",
				card1.kind,card1.number,Card.widh,Card.height);
		
		System.out.printf("card %s, number=%d, 크기는 (%d, %d)\n",
				card2.kind,card2.number,Card.widh,Card.height);
		
	}

	
	
	
	
	
}
