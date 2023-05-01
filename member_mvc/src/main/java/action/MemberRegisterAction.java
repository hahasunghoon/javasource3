package action;

import javax.servlet.http.HttpServletRequest;

import domain.MemberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post작업
		MemberDTO dto = new MemberDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setEmail(request.getParameter("email"));
		
		//service작업
		MemberRegisterService service = new MemberRegisterService();
	    boolean insertFalg	= service.memberInsert(dto);
	    
	    //회원 가입 성공시 로그인 페이지
	    String path="";
	    if(insertFalg) {
	    	path="login.jsp";
	    	   }else {
	    		   path ="register.jsp";
	    }
		
		//ActionForward 작업
		return new ActionForward(true, path);
	}

}
