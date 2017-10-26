<%--
  Created by IntelliJ IDEA.
  User: YangJing
  Date: 2017/10/26
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录</title>
</head>
<body>
<form action="<c:url value="/LoginServlet"/>" method="post">
    <div>
        <table align="center" width="40%" style="margin-left: 30px">
            <tr>
                <td width="100px">账户名</td>
                <td>
                    <input type="text" id="name" name="name"/>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="text" id="password" name="password"/>
                </td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td>
                    <input type="text" id="password1" name="password1"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="登录"/>
                    <input type="button" name="register" value="注册" onclick="location='<c:url value="/views/register.jsp"/> '"/>
                </td>
            </tr>
        </table>
    </div>
</form>
<font color="red" size="2"> ${msg}</font>
</body>
</html>
