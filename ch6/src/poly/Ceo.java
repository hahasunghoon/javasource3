package poly;

public class Ceo extends Employee { //Employee 상속받고 만듬

	@Override
	public void work() {
		
	System.out.println(super.getName()+" "+super.getPosition()+" 이(가) 업무를 봅니다");	
	}
	
	
}
