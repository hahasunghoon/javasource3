package ch1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class VariavleEx4 {
	public static void main(String[] args) {
	   
		String name = "hong";
		name = name + "77";
		System.out.println(name);
		
		String num = 7+7+"7"; // 14+ "7"
		System.out.println(num); // 147
		
		//printf() : 형식화된 출력, enter 없음
		// %d : 10진 정수의 형식 출력
		// %c : 문자
		// %s : 문자열
		// %f : 실수(부동소수점)
		int age = 25;
		System.out.println("age="+age);
		System.out.printf("age=%10d\n",age);
		
		char ch1='a';
		String str1 = "abcd";
		double d1 = 3.141592;
		System.out.printf("ch1=%10c\n",ch1);
		System.out.printf("str1=%s\n",str1);
		System.out.printf("%-10s\n",str1);
		System.out.printf("%10s\n",str1);
		System.out.printf("d1=%10.3f\n",d1);
		// \n 역슬래쉬n 하면 엔터 적용
		// .3을 넣으면 소수점 3자리까지 적용
		// 10을 넣으면 10칸뛰어서 출력
	}	

}
