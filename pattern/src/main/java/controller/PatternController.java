package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.factory.TransactionFactory;

import action.Action;
import action.ActionFactory;
import action.ActionForward;
import action.DeleteAction;
import action.InsertAction;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do") //Url mapping : 이름은 상관없으나 끝날때는 .do 끝나야함
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 request.setCharacterEncoding("utf-8");
		 
		String requestURI = request.getRequestURI();
		//프로젝트 == context
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI " +requestURI);
		System.out.println("contextPath " + contextPath);
		System.out.println("cmd "+cmd);
		
		ActionFactory actionFactory = ActionFactory.getInstance();
		
		Action action = null;
		
		//어디서 요청이 왔는지에 따라 액션 생성
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
			
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			 action = new DeleteAction();
		}
		
		//생성된 액션에 일 시키기(메소드 호출)
		ActionForward af = null;
			try {
			        af	= action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();		
		}
			//
			if(af.isRedirect()) {
				response.sendRedirect(af.getPath());
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
				rd.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
