package inheritance; //패키지 명은 소문자

//클래스 관계
//상속관계 (is-a) : Circle is a point  (원은 점이다)
//포함관계(has-a) : Circle has a point(원은 점을 가지고있다.)

//car
//엔진클래스
//도어클래스

//포함관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조변수를 선언
public class Circle { //point클래스와
	int x; //x좌표
	int y; //y좌표
	Point p = new Point(); //포함관계
	
	
	
	int r; //r반지름

}
