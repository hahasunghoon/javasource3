package action;

import javax.servlet.http.HttpServletRequest;

import service.BookDelectService;

public class BookDelectAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		
		// service를 통해 데이터베이스 작업
		BookDelectService service = new BookDelectService();
		boolean deleteFlag = service.remove(code);
		
		String path = "";
		if(deleteFlag) {
			path = "list.do";
		}
		
		// ActionForward
		return new BookActionForward(true, path);
	}

}
