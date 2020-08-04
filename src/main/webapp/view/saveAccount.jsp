<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>添加帐户</title>
</head>
<body>
    <h3 style="color: red">${message}</h3>
    <form action="${pageContext.request.contextPath}/account/save" method="post">
        <p>
            帐户名称:<input type="text" name="name">
        </p>
        <p>
            帐户余额:<input type="number" name="money">
        </p>
        <input type="submit" value="添加">
    </form>
</body>
</html>
