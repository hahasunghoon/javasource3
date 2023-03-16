package inheritance;

// 이 클래스 만들때는 브라우즈 클릭하고 inher...
//Tv 클래스를 상속받은 SmartTv
public class SmartTv extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
