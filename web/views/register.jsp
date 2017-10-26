<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YangJing
  Date: 2017/10/26
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="<c:url value="/RegisterServlet"/>" method="post">
    <div class="register">
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
                <td></td>
                <td>
                    <input type="submit" name="register" value="注册"/>
                </td>
            </tr>
        </table>
    </div>
</form>
<font color="red" size="2"> ${msg}</font>
</body>
</html>
