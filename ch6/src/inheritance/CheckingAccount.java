package inheritance;
//클래스 inheritance 에 맞게 변경 . 밑줄뜨면 밑줄 마우스 가져다 대고 클릭
public class CheckingAccount extends Account {
	
	


	public CheckingAccount(String ano, String owner, int balance) {
		super(ano, owner, balance);
		// TODO Auto-generated constructor stub
	}


	private String cardNo; //체크카드 번호
	
	
//은행계좌 + 체크카드


	//체크카드 사용액을 지불한다.(메소드)
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은 경우 사용액을 지불
	//카드번호 일치한지 확인
	
	//만약 은행잔고보다 크커간 카드번호가 일치하지 않으면 지불불가 메세지 출력
	
	//pay(cardNo, amount) : 잔액 리턴
	

	int pay(String carNo,int amount) { //카드 잔액이라 int 사용
		
		if(!this.cardNo.equals(carNo) || getBalance() < amount ) {
			System.out.println("카드번호나 잔액을 확인해 주세요");
			return 0;
		}
		
		//잔액 = 잔액 -사용액
		setBalance(getBalance()-amount);
		return getBalance(); //return 은 여기까지만하고 돌아가
	
	//부모의 메소드 호출
   	 return super.withdraw(amount);
	
	
	
	}
	
	
	
}
