<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--     내장 객체

         1) HttpServletRequest request; (요청 처리)
         2) HttpServletResponse response; (응답 처리)
         ★  sendRedirect("이동할 페이지명") : 페이지 이동
         3) PageContext pageContext; : 다른 내장 객체에 접근할 수 있는 권한
             include() == include 지시어가 하는 역할
         4)★ HttpSession session; : 세션을 다루는 객체
         5) ServletContext application; 웹 어플리케이션(현재web1프로젝트)의 실행환경을 제공하는 서버측 정보, 서버측 자원에
            해당하는 정보를 다룰 수 있는 객체
         6) jspWriter out; 자바코드로 화면출력
         7) java.lang.Object page;
         
         http://localhost:8080/jsp/response1.jsp 요청 =>
          http://localhost:8080/jsp/response2.jsp 응답
    --%>
    <%
       pageContext.include("header.jsp");
    %>
    
    <%@include file="header.jsp" %>
    <main>
    <%
     // int age = 10; 
     // out.print(age); 
    %>
    <h3>main 영역</h3>
    </main>
    <%
      pageContext.include("footer.jsp");
    %>
</body>
</html>