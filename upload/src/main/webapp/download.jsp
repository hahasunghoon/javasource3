<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   //사용자가 다운로드 받기를 원하는 파일명
   String fileName = request.getParameter("fileName");

   //서버 폴더에 가서 사용자가 요청한 해당 파일 가져오기
   //자바 File
   FileInputStream fis = new FileInputStream("e:\\upload\\"+fileName);
   BufferedInputStream bis = new BufferedInputStream(fis);
   
   out.clear();
   out = pageContext.pushBody();
   
   //브라우저에 파일 붙여서 보내기
   //UUID 값 제거 : af62598e-93af-47fd-94bb-3aaa6b475a8e_pat.jpg     _제거
   fileName = fileName.substring(fileName.indexOf("_")+1);
   
   //인코딩: ex) te st.jpg => te\\+st.jpg
   fileName = URLEncoder.encode(fileName, "utf-8").replaceAll("\\+", "%20");
   
   response.setContentType("application/octet-stream"); //MIME
   response.setHeader("Content-Disposition", "attachment;filename="+fileName);
   
   BufferedOutputStream buf = new BufferedOutputStream(response.getOutputStream());
   
   int numRead=0;
   byte[] b = new byte[4896];
   while((numRead = bis.read(b))!=-1) {
	   buf.write(b,0,numRead);
   }
   
   buf.flush();
   buf.close();
   bis.close();

%>