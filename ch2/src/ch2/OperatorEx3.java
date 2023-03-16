package ch2;

/*연산자
 * 1) 단항연산자
 *    +, -, ++, -- ~ !
 * 2) 이항연산자
 *     산술 : +, -, *, /, %, <<, >>, >>>
 *     비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
 *     논리 : &&(and), ||(or), &(and), ^(xor),|(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =   ex) a=4;
 * 
 * 연산자 우선순위
 *  5 + (3*4)
 */
public class OperatorEx3 {

	public static void main(String[] args) {
		
		int charCode='A';
		System.out.println(charCode);
		
		if((charCode>=65) && (charCode<=90)) {
			System.out.println("대문자");
		}
		
		int x=15;
		if(x > 10 && x < 20) {
			System.out.println("x는 10~20사이에 있음");
		}
		
		
		//논리연산자 : true, false 를 주고 결과도 true, false로 나옴
		//&&(and 결합): X는 10보다 크고 20보다 작다
		//                         X > 10 && X < 20
		// ||(or 결합) : i는 2의 배수 또는 3의 배수이다
		//                    i%2==0 || i%3==0
		// i는 2의 배수 또는 3의 배수 이지만 6의 배수는 아니다
		// (i%2==0 || i%3==0) && i%6!=0
		
		
	
	}

}
