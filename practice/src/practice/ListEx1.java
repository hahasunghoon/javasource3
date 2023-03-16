package practice;

import java.util.ArrayList;

public class ListEx1 {

	public static void main(String[] args) {
		// ArrayList에 Member 객체를 추가
		
		ArrayList<Member1> list = new ArrayList<>();
		
		list.add(new Member1("하성훈"));
		list.add(new Member1("서민기"));
		list.add(new Member1("고동현"));
		list.add(new Member1("김상현"));
		
		System.out.println(list);
		
		//Member2 담는 ArrayList 생성
		
		ArrayList<Member2> list2 = new ArrayList<>();
		
		list2.add(new Member2("하성훈","tjdgns573","123"));
		list2.add(new Member2("서민기", "sususu", "4567"));
		list2.add(new Member2("고동현", "koill", "789"));
		list2.add(new Member2("김상현", "ksh102", "0000"));
		
		System.out.println(list2);
		System.out.println("size() "+list.size());
		
		for (int i = 0; i < list2.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println("id : "+member.getId()+", pssword : "+member.getPassword()+", name : "+member.getName());
			
			
		}
		
		

	}

}
