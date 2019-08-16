<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>

<a href="insert.do">添加用户</a>


<form action="/insert.do" id="test_form">
    <input type="test" id="id" name="id"><br>
    <input type="text" id="username" name="username"><br>
    <input type="password" id="password" name="password"><br>
    <input type="submit" name="sub"><br>
    <input type="button" onclick="myFunction()"value="修改">


</form>
<script>
    function myFunction() {
        document.getElementById('test_form').action = "/updateInput.do";
        var form = document.getElementById('test_form');
        form.submit();
    }
</script>
<table border="1" style="margin: auto" width="300px">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>手机号</th>
        <th>操作</th>
    </tr>
    <tbody>
    <c:forEach items="${accounts}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <%--<td>${item.phonenumber}</td>--%>
            <td> <a href="/delect.do?id=${item.id}">删除</a>
                 <a href="/update.do?id=${item.id}">修改</a> </td>
        </tr>
    </c:forEach>
    </tbody>

</table>

</body>
</html>
