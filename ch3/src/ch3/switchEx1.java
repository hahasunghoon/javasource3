package ch3;

public class switchEx1 {

	public static void main(String[] args) {
		// switch : if~else if~else 대신 사용
		// swi 컨트롤 스페이스바 두번째꺼
		
//		int jumsu=70;
//		char grade=' '; //char : 문자 한개
//		if(jumsu>=90) {
//			grade='A';
//		}else if(jumsu>=80) {
//			grade='B';
//		}else if(jumsu>=70) {
//			grade='C';
//		}else if(jumsu>=60) {
//			grade='D';
//		}else if(jumsu>=50) {
//			grade='E';
//		}else { //0~49
//			grade='F';
//	    }
		int month=3;

		switch (month) {
		case 3 : //month==3
		case 4 : 
		case 5 : 
			System.out.println("현재 계절은 봄");
		break;//브레이크를 만나면 속해있는 블럭을 빠져나가게하는것
		case 6 : case 7: case 8:
			System.out.println("현재 계절은 여름");
			break;
		case 9 : case 10: case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 12 : case 1: case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}
		//if 문으로 바꾸면
		if(month==3 || month==4 || month==5) {
			System.out.println("현재 계절은 봄");
		}else if (month==6 || month==7 || month==8) {
			System.out.println("현재 계절은 여름");
		}else if (month==9 || month==10 || month==11) {
			System.out.println("현재 계절은 가을");
		}else if (month==12 || month==1 || month==2) {
			System.out.println("현재 계절은 겨울");
		}
		
		
	}

}
