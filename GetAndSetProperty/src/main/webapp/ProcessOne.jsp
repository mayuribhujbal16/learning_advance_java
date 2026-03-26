<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj1" class="com.User"/>

<% String name="John"; %>
<jsp:setProperty name="obj1" property="name" value="<%=name %>"/>

Record:<br>
<jsp:getProperty property="name"  name="obj1"/><br>

</body>
</html>