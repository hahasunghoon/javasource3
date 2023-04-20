<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
           <!-- 모든 jsp와 servlet은 각각의 request,response 를 개별로 가지고 있음 
           
                forward() 쓰는 이유
                웹서비스를 페이지를 작성할 때
                페이지끼리 데이터 공유가 필요함, 로그인,장바구니 =>session, cokkie
                
                데이터 공유시 모든 데이터를 session 을 사용하지않음
                
                session 을 사용하지 않는 데이터 공유? ==> forward 필요함
                게시판
                session 을 사용하는 데이터 공유 =>>send~
           
            -->
<%-- <h4>아이디 : <%=request.getParameter("userid") %></h4>
<h4>비밀번호 : <%=request.getParameter("password") %></h4>
--%>

<h4>아이디 : <%=request.getAttribute("userid") %></h4>
<h4>비밀번호 : <%=request.getAttribute("password") %></h4>
</body> 
</html>