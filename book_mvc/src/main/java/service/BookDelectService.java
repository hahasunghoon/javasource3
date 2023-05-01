package service;


import persistence.BookDAO;

public class BookDelectService {
	public boolean remove(int code) {
		//return new BookDAO().delete(code);
		
		BookDAO dao = new BookDAO();
		return dao.delete(code);
	}
		
	

}
