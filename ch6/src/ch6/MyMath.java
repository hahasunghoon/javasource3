package ch6;
/*인스턴스 메소드 : 인스턴스(객체)를 생성하고 사용해야 함
 * 클래스(static)메소드 : 인스턴스(객체)를 생성하지 않고 바로 사용이 가능함
 *                                     클래스명.메소드명()
 * 
 */
public class MyMath {
	//멤버(인스턴스)변수
	long a, b;
	
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	long divide() {
		return a / b;
	}

	//기본형 매개변수(지역변수)를 이용한 사칙연산
//	static long add2() {
//		return a+ b; 
		//Cannot make a static reference to the non-static field a 이런 엑박이 뜨는데
		//static 메소드안에서는 인스턴스를 바로 사용할수 없다.
//	}
	
	static long add(long a, long b) {
		return a + b;
	}
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(long a, long b) {
		return a / (double)b;
	}

	
	
	
	
	
	
	
}
