package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
//		employee.work();
		workPint(employee);
		
		// 다향성 개념 (왼쪽 부모 . 오른쪽 자식)
		// 마지막에 work(); 걸어주자
		//메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행
		Ceo employee2 = new Ceo();
		employee2.setName("하성훈");
		employee2.setPosition("CEO");
//		employee2.work();
		workPint(employee2);
		
		Adiminstrator employee3 = new Adiminstrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
//		employee3.work();
		workPint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
//		employee4.work();
		workPint(employee4);
				
	}
	//Employee employee = employee2
	//Employee employee = employee3
	static void workPint(Employee employee) {
		employee.work();
		
	}

	
	
	
	
}
