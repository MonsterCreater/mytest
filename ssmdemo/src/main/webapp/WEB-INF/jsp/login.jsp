<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/login" method="post">
用户名:<input type="text" name="userName"/><br/>
密码:<input type="password" name="userPwd"/><br/>
<input type="submit" value="登录"/>&nbsp;<input type="reset" value="重置"> 
</form>
</body>
</html>