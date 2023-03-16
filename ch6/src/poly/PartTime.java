package poly;

public class PartTime extends Employee { //Employee 상속받고 만듬

	@Override
	public void work() {
		
	System.out.println(super.getName()+" "+super.getPosition()+" 주어진 시간동안 일을 합니다");	
	
	}
	
	
}
