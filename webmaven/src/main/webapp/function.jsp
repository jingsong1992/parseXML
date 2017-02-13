<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.main.bean.FuncPro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%!String function = null;
   String product = null;
%>
<% 
String date = request.getAttribute("value").toString();
String[] a = date.split("]");

%>
</head>
<body>
	<form action="GetNameServlet">
	<%for(int i=0;i<a.length;i++){
		%><input type="submit" name="funcName" value="<%=a[i]%>"/><% 
	} %>
	
	</form>
</body>
</html>