package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// Person객체를 set 구조에 담기
		Set<Person> set = new HashSet<>();
		
		//사용자 정의 객체는 중복저장을 허용함
		// 허용하지 않으려면? 작업이 필요하다.
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

		
		//중복 저장이 안되도록 equals(), hashcode() 오버라이딩 해야함
		//person클래스에 소스->hashcode
		
		
	}

}
