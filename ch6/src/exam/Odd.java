package exam;

public class Odd extends OddDetector {
	public Odd(int n) {
		super(n);		
	}

	@Override
	public boolean isOdd() {
		// 홀수이면 true 리턴, 짝수면 false 리턴
		return false;
	}

}
