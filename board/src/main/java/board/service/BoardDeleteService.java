package board.service;

import board.persistence.BoardDAO;

public class BoardDeleteService {
	public boolean remove(int bno,String password) {
				
		return new BoardDAO().delete(bno,password);
	}
}