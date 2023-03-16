package ch4;
/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할때 사용
 * 종류 : for(주로 사용), while, do-while
 */

public class ForEx1 {

	public static void main(String[] args) {
		//①int i=0; 먼저 실행 [초기화 라고부른다]
		//② i < 10; 두번째로 실행 [조건식 이라고부른다](★false일때 반복문종료)
		//③ 조건식이 true 일때 { 블럭 안으로 진입
		//④ i++ 세번째로 실행된다.(++은 증가의의미 결국 i=1 이된다)
		//⑤ i < 10; true이니 또 블럭안으로 진입 이런식으로 조건식이 반복
		//조건식이 거짓이 될때까지
		for (int i=0;  i < 10; i++) { 
		System.out.print(i+"  ");
			
		}
		//System.out.println(i); i만 못넣는다
		// 반대로10~1까지 출력
		System.out.println();
		for (int i=10;  i >= 1; i--) { 
			System.out.print(i+"  ");
				
			}
		
		//i+=2
		//로 해석 된다i= i+2;
		//ex)
		// sum=10;
		//sum=sum+3; sum+=3;
		
		// 1 3 5 7 9
		System.out.println();
		for (int i=1;  i <= 10; i+=2) { 
			System.out.print(i+"  ");
				
			}
		// 1~10까지 덧셈 결과 출력
		// int sum = 1+2+3+4+5+...이걸 for문으로
//		sum=1;
//		sum=sum+2;
//		sum=sum+3;
//		sum=sum+4;
		
		System.out.println();
		int sum=0;
		for (int i=1; i<=10; i++) {
			sum= sum+i; // 또는 sum+=1; 표현가능
		}
		System.out.println("1~10 합"+sum);

	}

}
