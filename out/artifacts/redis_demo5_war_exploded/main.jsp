<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/18
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty loginAdmin}">未登录</c:if>
<c:if test="${not empty loginAdmin}">${loginAdmin.adminname}</c:if><br>
<table class="tablelist">
    <thead>
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品数量</th>
        <th>商品价格</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.pid}</td>
            <td>${product.pname}</td>
            <td>${product.pnum}</td>
            <td>${product.pprice}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
