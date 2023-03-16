package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		//클래스로부터 객체를 만드는 과정 : 인스턴스화
       // Tv 객체 생성
	  //클래스만드는건 아주 중요하다
      //Tv tv = new Tv(); // 클래스 이름 변수명=new★ 클래스이름()

		//객체선언
		Tv tv;
		//객체 생성
		tv = new Tv();
		//객체가 가지고있는 속성, 메소드를 사용하기 위해서는 .(dot)로 접근
//		System.out.println("색상 " +tv.color);
//		System.out.println("채널 " +tv.channel);
//		System.out.println("전원여부 " +tv.power);
		print(tv); //주소 넘어감
		
		
		//메버변수 초기화를 하자
		tv.color = "black";
		tv.channel = 6;
		tv.power = true;
		
		//초기화 후 확인
//		System.out.println("색상 " +tv.color);
//		System.out.println("채널 " +tv.channel);
//		System.out.println("전원여부 " +tv.power);
		print(tv);
		
		// 메소드를 호출 했다. ==> 메소드가 실행된다.
		tv.channelUp();
		System.out.println("채널"+tv.channel);
		
		tv.power();
		System.out.println("전원여부"+tv.power);
	
		//화이트 tv만들고싶다
		Tv tv2 = new Tv();
		tv2.color = "white";
		tv2.channel = 11;
		
		//tv켜기 , tv끄기
		tv2.power(); 
		print(tv2); //호출
//		System.out.println("색상 " +tv2.color);
//		System.out.println("채널 " +tv2.channel);
//		System.out.println("전원여부 " +tv2.power);
		
		}
	//static 으로
	static void print(Tv tv) { //타입 Tv가 중요
		System.out.println("색상 " +tv.color);
		System.out.println("채널 " +tv.channel);
		System.out.println("전원여부 " +tv.power);
	}
	
	
	
	
	
}
