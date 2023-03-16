package exam;

public abstract class Calc { //문제
	int a,b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();

}
