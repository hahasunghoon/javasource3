package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		
		System.out.println(calc.add(5,3)); //int 호출 Cal ( Calc2에있는걸)
		
		System.out.println(calc.add(5, 3L));//long 호출
		
		System.out.println(calc.add(5, 3L));
		
		System.out.println(calc.add(5, 3.0f)); //float 호출
		
		int num[] = {1,2,3,4,5}; //배열 호출
		calc.add(num);
		//위에걸 결과값볼려면 system.out.println...앞에 붙이면된다.
		
		
		
		
	}

	
}
