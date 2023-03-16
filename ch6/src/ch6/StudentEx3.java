package ch6;

import java.util.Iterator;
import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		// Student2 인스턴스생성
		//사용자로부터 입력을 받은 정보를 가지고 생성
		
		Scanner sc = new Scanner(System.in);
		
//		//sudent2 컨트롤 스페이스바 2번째꺼
//		Student2 student2 = new Student2(null, 0, 0, 0, 0, 0);
//		
//		//이름,반,번호,국어,영어,수학 점수 입력받기
//		System.out.println("이름 >> " );
//		String name = sc.nextLine();
//		
//		System.out.println("반 >> ");
//		int ban = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("번호 >> ");
//		int no = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("국어 >> ");
//		int kor = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("영어 >> ");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("수학 >> ");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		Student2 student = new Student2(name, ban, no, kor, eng, math);
//		//student2 에서 오른쪽 스페이스바 소스 -> to string
//		
		//주소 ==> 인스턴스 변수가 가지고 있는 값으로 출력(to String())
//		
//		System.out.println(student);
		
		//입력밧으로 Student2 인스턴스를 3개생성
		
		Student2 student[] = new Student2[3];
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("이름 >> " );
			String name = sc.nextLine();
			
			System.out.println("반 >> ");
			int ban = Integer.parseInt(sc.nextLine());
			
			System.out.println("번호 >> ");
			int no = Integer.parseInt(sc.nextLine());
			
			System.out.println("국어 >> ");
			int kor = Integer.parseInt(sc.nextLine());
			
			System.out.println("영어 >> ");
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.println("수학 >> ");
			int math = Integer.parseInt(sc.nextLine());
			
			//입력값으로 sudent2 생성
			student[i] = new Student2(name, ban, no, kor, eng, math);
			
			//확인
			for (int j = 0; j < student.length; j++) {
				System.out.println(student[i]);
				
			}
			
			for(Student2 stu:student) {
				System.out.println(stu);
			}
			
			
			
			
			
			

		
		}
		
		
		


	}

}
