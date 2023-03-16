package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 { //member1클래스 생성 후

	public static void main(String[] args) {
		// ArrayList에 Member 객체를 추가
		
		ArrayList<Member1> list = new ArrayList<>();
		list.add(new Member1("홍길동"));
		list.add(new Member1("성춘향"));
		list.add(new Member1("고길동"));
		list.add(new Member1("강감찬"));
		list.add(new Member1("송혜교"));
		
		
		
		
//		Member1[] members = new Member1[10];
//		members[0] = new Member1("");
		
		System.out.println(list);
		
		//Member2 담는 ArrayList 생성
		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("홍길동", "hong123",  "hong123")); //0번
		list2.add(new Member2("고길동", "kong123",  "kong123")); //1번
		list2.add(new Member2("성춘향", "song123",  "song123")); //2번
		list2.add(new Member2("강감찬", "kong123",  "kong123"));// 3번
		list2.add(new Member2("송혜교", "tong123",  "tong123")); // 4번
		
		
		System.out.println(list2); // 오버라이딩된 tostring()출력 ==> list2 확인용도
		
		System.out.println( "size()"+list.size()); //결과값은 5 i는 0부터 4까지 돌면서
		
		//1번쨰 방법
		for(int i=0; i<list2.size(); i++) {
			Member2 member = list2.get(i);//get(i) 특정 요소 가져오기
			System.out.println( "id : "+member.getId()+", pssword : "+member.getPassword()+", name : "+member.getName());
			
		}
		
		
		//2번쨰방법
		//for 스페이스바 첫번째꺼
		// Iterator 인터페이스 : List, Set, Map 구조에서 요소를 접근하는 방법에 대한 통일성 제공
		// hasNext() : 다음요소 가져오기
		// next() : 요소 가져오기
		System.out.println();
		System.out.println("id   password   name");
		System.out.println("============================================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) { 
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
			
		}
		//3번째방법
		//for 스페이스바 foreach
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
			
		}
		

	}

	
	
	
	
	
	
}
