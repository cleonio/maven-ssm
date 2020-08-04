<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>修改帐户</title>
</head>
<body>
    <h3 style="color: red">${message}</h3>
    <form action="${pageContext.request.contextPath}/account/update" method="post">
        <%--隐藏表单，用来保存帐户id--%>
        <input type="hidden" name="id" value="${account.id}">
        <p>
            帐户名称:<input type="text" name="name" value="${account.name}">
        </p>
        <p>
            帐户余额:<input type="text" name="money" value="${account.money}">
        </p>
        <input type="submit" value="修改">
    </form>
</body>
</html>
