package inter;

public class FighterEx {

	public static void main(String[] args) {
		//인터페이스는 인스턴스 생성불가
		//인터페이스를 구현하는 클래스가 존재해야 의미가있음
		//Attackable attackable = new Attackable(); (x)
		
		
		//다형성
		Fightable fightable = new Fighter();

	}

}
