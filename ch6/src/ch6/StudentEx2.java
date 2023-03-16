package ch6;

public class StudentEx2 {

	public static void main(String[] args) {
		// Sutudent2 객체 배열
		Student2 stuArr[]=new Student2[5];
		
		
		//기본값 확인 null
		System.out.println(stuArr[0]);
		
		//초기화 Student2 컨트롤 스페이스바 2번째꺼
		stuArr[0]=new Student2("홍길동", 65, 45, 60, 20, 50);
		stuArr[0]=new Student2("고동현", 45, 50, 54, 79, 90);
		stuArr[0]=new Student2("김상현", 60, 40, 60, 80, 10);
		stuArr[0]=new Student2("서민기", 65, 65, 94, 72, 65);
		stuArr[0]=new Student2("하성훈", 60, 84, 80, 70, 40);
		
		//하성훈 학생의 정보 출력 (한사람)
//		System.out.println("이름: "+stuArr[0].name );
//		System.out.println("반: "+stuArr[0].ban );
//		System.out.println("번호: "+stuArr[0].no );
//		System.out.println("국어: "+stuArr[0].kor );
//		System.out.println("영어: "+stuArr[0].eng );
//		System.out.println("수학: "+stuArr[0].math );
		
		//전체 학생의 정보출력 (컨트롤 스페스바 2번째꺼)
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("이름: "+stuArr[i].name );
			System.out.println("반: "+stuArr[i].ban );
			System.out.println("번호: "+stuArr[i].no );
			System.out.println("국어: "+stuArr[i].kor );
			System.out.println("영어: "+stuArr[i].eng );
			System.out.println("수학: "+stuArr[i].math );
			System.out.println("수학: "+stuArr[i].getTotal() );
			System.out.println("수학: "+stuArr[i].getAverage() );
			
		}
		
		
		
	}

	
	
	

}
