package inheritance;
//this : 자기자신
//tins() : 생성자에서 내가 가지고있는 다른 생성자를 호출 시, -Student 참고
//this.변수명 : 매개변수와 이름이 같을때 구별하기위해

//super : 부모
//super() : 생성자에서 부모 생성자를 호출 시, super.변수명 : 부모
//super.변수명 : 부모가가지고있는 인스턴스 변수를 사용할때

public class Tv2 {
	boolean power;
	int channel;
	
	//컨트롤 스페이스바 소스-슈퍼클래스
//	private Tv2() {
//		super(); //부모의 기본생성자 호출
//		}
	
	public Tv2(boolean power, int channel) {
		super();
		this.power = power;
		this.channel = channel;
		
		
	}
	
	void power() {
		power = !power;
	}
	void channel() {
		channel++;
	}
	void channelDwon() {
		channel--;
	}

	
	
	
}
