package register; //2) 메인있는 클래스 만듬

import java.util.ArrayList;
import java.util.Scanner;


public class MemberUi {

	public static void main(String[] args) {
		
		boolean isStop = false;
		Scanner sc = new Scanner(System.in); //입력받기 위해
		
		MemberConsoleUtil util = new MemberConsoleUtil();
		ArrayList<Member> list = new ArrayList<>(); // 회원정보를 담을객체
		
	Member member = null;
		
		//do 컨트롤 스페이스바
		do {
			
			System.out.println("================= 회원 관리 프로그램 =================");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 목록보기");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================================");
			
			System.out.println("메뉴번호 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				member = util.getNewMember(sc);// util.getNewMember(sc) 이걸 MemberConsoleUtil 클래스에서 호출하자 (sc) 넣으면 콘솔유틸(scanner sc)넣자
				//리턴값 member list에 추가
				list.add(member);
				util.printAddSuccessMessage(member);
				break;
            
			case 2:
				util.printMemberList(list);
				break;
             
			case 3:
                member = util.updateMember(sc, list);
				
				if(member!=null) {
					util.printUpdateSuccessMessage(member);
				}else {
					util.printUpdateFailMessage();
				}		
	            break;
            
			case 4:
				member = util.removeMember(sc, list);
				if(member!=null) {
					util.printRemoveSuccessMessage(member);
				}else {
					util.printRemoveFailMessage();
				}	
	
	           break;         
              
			case 5:
            	  isStop = true;
            	  
            	  break;         

			default:
				break;
			}
			
			
			
			
		} while (!isStop);

	}

}
