<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YangJing
  Date: 2017/10/26
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>注册结果</title>
</head>
<body>
<h1 style="color:red;">${msg}</h1>
<a href="<c:url value="/index.jsp"/>返回登录页面</a>
</body>
</html>