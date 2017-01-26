<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
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
ArrayList<FuncPro> list = (ArrayList)(request.getAttribute("value"));
for(int i =0;i<list.size();i++){
	function = (String)(list.get(i).getFunction());
	product = (String)(list.get(i).getProduct());
}
%>
</head>
<body>
	<form action="GetNameServlet">
		<input type="submit" name="funcName" value="<%=function%>" >
	</form>
</body>
</html>