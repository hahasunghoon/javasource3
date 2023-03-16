package inheritance;

// 이 클래스 만들때는 브라우즈 클릭하고 inher...
//Tv 클래스를 상속받은 SmartTv

public class SmartTv2 extends Tv {
	boolean caption;
	
	//컨트롤 스페이스바 소스-슈퍼클래스
	private SmartTv2() {
		super();//부모(Tv)의 기본생성자 호출
		}

	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
