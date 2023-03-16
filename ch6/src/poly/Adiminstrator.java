package poly;

public class Adiminstrator extends Employee { //Employee 상속받고 만듬

	@Override
	public void work() {
		
	System.out.println(super.getName()+" "+super.getPosition()+" 이(가) 열심히 일을 합니다");	
	}
	
	
}
