package ch6;
/*클래스 : 객체를 정의 해놓은 것
 * 클래스 용도 : 객체를 생성하는 데 사용
 * 객체 : 실제로 존재하는 것. 사물 or 개념
 * 여기선 클래스를 만들어보자
 */
public class Tv {
	//속성(property) ==> 멤버변수
	//크기, 길이, 높이, 색상, 볼륨, 채널... ..
    String color; // 색상
    int channel; // 채널
    boolean power; // 전원상태
	
	//기능(function) ==> 메서드
	//켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경... ...
    void power() {
    	power = !power;
    	}
    
    void channelUp() {
    	channel++;
    	}
    
    void channelDown() {
    	channel--;    
        }
    }
