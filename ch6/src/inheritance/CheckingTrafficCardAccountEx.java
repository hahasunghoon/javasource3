package inheritance;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		
		CheckingTrafficCardAccount checkingTrafficCardAccount 
		= new CheckingTrafficCardAccount("110-22", "성춘향", 10000, "3333-4444", false);


		CheckingTrafficCardAccount checkingTrafficCardAccount2
		= new CheckingTrafficCardAccount("110-22", "홍길동", 10000, "5555-4444", true);
	
		//교통카드 기능이 없을 때
		checkingTrafficCardAccount.payTafficCard("3333-4444", 2500);
		
		//교통카드 기능이 있을때 - 카드번호가 일치하지 않는다면
		System.out.println(checkingTrafficCardAccount2.payTafficCard("6666-7777", 15000));
		
		//교통카드 기능이 있을때 - 카드번호가 일치,
		System.out.println(checkingTrafficCardAccount2.payTafficCard("5555-4444", 15000));
	
	
	
	
	
	}

	
	
}
