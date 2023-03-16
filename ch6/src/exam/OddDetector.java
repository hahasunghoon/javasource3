package exam;

public abstract class OddDetector {

	private int n;

	protected OddDetector(int n) {
		super();
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public abstract boolean isOdd();
}
