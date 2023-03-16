package abstr;

public class Marine extends Unit {
	
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Marine[x="+x+", y="+y+"]");
		
	}

}

class Tank extends Unit{ //밑줄드면 클릭
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
			
		
		
	}
}

class DropShip extends Unit {
	
	void load() {}
	void unload() {}
	@Override
	void move(int x, int y) {
		System.out.println("DropShip[x="+x+", y="+y+"]");
		
		
	}

	
}