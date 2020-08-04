
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>帐户列表</title>

    <script src="../js/jquery-3.3.1.min.js"></script>


</head>
<body>
    ${message}
<a href="${pageContext.request.contextPath}/view/saveAccount.jsp">添加帐户</a>
  <table border="1" cellspacing="0" cellpadding="0" >
      <tr>
          <th width="80">编号</th>
          <th width="100">帐户名称</th>
          <th width="80">余额</th>
          <th width="120">操作</th>
      </tr>
      <c:forEach items="${accountList}" var="account">
      <tr id="onetr">
          <td>${account.id}</td>
          <td>${account.name}</td>
          <td>${account.money}</td>
          <td>
              <a href="${pageContext.request.contextPath}/account/findById?id=${account.id}">修改</a>&nbsp;&nbsp;
              <a href="javascript:void(0)" onclick="del(${account.id})">删除</a>
          </td>
      </tr>
      </c:forEach>

  </table>


    <script>

        function del(id) {
            confirm("是否确定删除");
            $.post("deletebyid",{id:id},function (rmassage) {
                /*alert(data);*/
                var List = rmassage.list;

                var rh="";
                for (var i=0; i<List.length; i++){
                    rh+='<tr>\n' +
                        '                    <td>'+List[i].id+'</td>\n' +
                        '                        <td>'+List[i].name+'</td>\n' +
                        '                        <td >'+List[i].money+'</td>\n' +
                        '                        <td>\n' +
                        '                        <a href="${pageContext.request.contextPath}/account/findById?id=${account.id}">修改</a>&nbsp;&nbsp;\n' +
                        '                        <a href="javascript:void(0)" onclick="del(${account.id})">删除</a>\n' +
                        '                        </td>\n' +
                        '                 </tr>'
                }

                $("#onetr").html(rh);
                alert(rmassage.massage)

            },"json");
        }



    </script>
</body>
</html>
