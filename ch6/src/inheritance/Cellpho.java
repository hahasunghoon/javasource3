package inheritance;

public class Cellpho extends CellPhone {
	//CellPhon + Dmb 기능 추가
	
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+" 번 DMB 방송 시작");
	}
	void changChannelDmb(int cjnnel) {
		this.channel =channel;
		System.out.println("채널 "+this.channel+" 번 으로 변경");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+" 번 DMB 방송 종료");
	}

	
	
	
	
	
	
	
}
