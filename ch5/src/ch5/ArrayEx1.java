package ch5;
/*배열(array)
 * 같은 타입의 여러 변수를 하나의 묶음(30 . 100개)으로 다루는 방법
 * ex) int score1=98, score2=88, .....;
 * 
 * ==> int score[]; //배열을 선언한다.
 * ==> score = new int[30]; // 배열 생성 
 */
public class ArrayEx1 {

	public static void main(String[] args) {
		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성
		//index 를 이용해서 접근을 할 수 있다.
		//int 타입은 0으로 초기화 됌
		int score[]=new int[30];//0~29 인덱스로 접근
		
		System.out.println(score[0]); 
		System.out.println(score[15]); //0~14 인덱스로 접근
		
		//새로운 값을 할당
		score[0]=98; 
		score[1]=88;

		//배열선언, 생성, 초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[]= {98,88,78,68,58,48,38,28,18,8};
		//5번째 학생의 점수가 궁금할때
		System.out.println("5번째 학생 점수"+score2[4]);
		//(소수점) 10명 모두 출력 하고싶다
		double score3[]= {9.8,8.8,7.8,6.8,5.8,4.8,3.8,2.8,1.8,0.8};
//		System.out.println("1번째 학생 점수"+score3[0]);
//		System.out.println("2번째 학생 점수"+score3[1]);
//		System.out.println("3번째 학생 점수"+score3[2]);
//		System.out.println("4번째 학생 점수"+score3[3]);
//		System.out.println("5번째 학생 점수"+score3[4]);
//		System.out.println("6번째 학생 점수"+score3[5]);
//		System.out.println("7번째 학생 점수"+score3[6]);
//		System.out.println("8번째 학생 점수"+score3[7]);
//		System.out.println("9번째 학생 점수"+score3[8]);
//		System.out.println("10번째 학생 점수"+score3[9]);
		//반복이네? for로 바꾸자
		
		System.out.println("score3 길이"+ score3.length);
		
		for (int i = 0; i < score3.length; i++) { //score3.length; 10을 의미
			System.out.println((i+1)+"번째 학생 점수"+score3[i]);
		}
		//char 5개를 담는 배열
		char chArr[]= {'a', 'b', 'c', '가', '나'};
		
		//byte.char,short,int,long,float,double,boolean =>>배열타입가능
		
	    String strArr[]= {"abc","efg"};
	    
	    // java.lang.ArrayIndexOutOfBoundsException 이오류는
	    // "abc",efg",(0,1) 인데 strArr[2]는 3이므로 범위에 벗어난것
	    System.out.println(strArr[2]);
		

	}

}
