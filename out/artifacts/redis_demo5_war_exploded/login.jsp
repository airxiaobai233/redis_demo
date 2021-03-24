<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/18
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/admin/login" method="post">
    登录名：<input type="text" name="adminname" >
    密 码：<input type="text" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
