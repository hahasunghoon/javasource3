package ch6;

public class Time {
	
	//속성 - 시,분,초
	private int hour;
	private int minute;
	private int second;
	
	
	//멤버변수가 private 키워드를 사용하게되면
	//외부에서 접근 불가 -> 메소드를 통해서만 클래스 속성의 값을 얻가나 변경할 수 있도록
	//제공해야함 ->getter / setter 이용
	
	// 시간은 24시가 넘으면 안되므로 0~23 사이라면 시간 변경
	// 메소드에서 return을 만나면 수행할 구문이 있더라도 메소드는 종료
	public void setHour(int hour) {
		if(hour <0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	
	
	
	public void setMinute(int minute) {
		
		//0~59사이로 값이 넘어올때만 minute 값을변경
		if(minute <0 || minute >59)
			return;
	
	
	//0~59사이일때만 실행
	this.minute = minute;
    }
	
	//0~59 사이로 값이 넘어올때만 second값을 변경
	public void setSecond(int second) {
		if(second <0 || second > 59) return;
	}

	public int getMinute() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSecond() {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
	
	
}
