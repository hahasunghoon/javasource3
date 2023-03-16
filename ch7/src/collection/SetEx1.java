package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 인터페이스 : 순서를 유지하지않음 , 데이터 중복 허용하지않음
//    구현클래스 : HashSet , TreeSet....

public class SetEx1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i));
			
		}

		//중복 허용하지않음
		set.add("9");
		
		System.out.println(set);
		
		//for / while
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
	}

}
