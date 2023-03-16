package ch6;
/* 메소드 오버로딩
 * 메소드 이름이 같아야함
 * 매게변수의 개수 또는 타입이 달라야함
 *반환타입은 관계없음
 */
public class Calc2 {
	int add(int a, int b) {
		return a+b;
	}

	
	long add(int num1, long num2) { //가로안에 무조건 틀려야함
		return num1+num2;
	}
	long add(long num1, int num2) { //가로안에 무조건 틀려야함
		return num1+num2;
	}
	
	int add(int[] arr) { // 배열 동일
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			}
		return result;
	}

	float add(int a, float b) {//가로안에 달라야함
		return a+b;
	}




}
