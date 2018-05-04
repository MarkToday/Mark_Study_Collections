<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%--  
  Created by eclipse.  
  User: zyc  
  Date: 2018/4/28  
  Time: 15:53  
  To change this template use File | Settings | File Templates.  
--%>  
<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<html>  
<head>  
    <title>用户列表显示</title>  
</head>  
<body>  
<table border="1">  
    <tr>  
        <td>序号</td>  
        <td>姓名</td>  
        <td>账户</td> 
        <td>密码</td> 
        <td>生日</td> 
    </tr>  
        <c:choose>  
            <c:when test="${not empty userList}">  
                <c:forEach items="${userList}" var="user" varStatus="vs">  
                    <tr>  
                        <td>${user.userId}</td>  
                        <td>${user.userName}</td>  
                        <td>${user.userAccount}</td>  
                        <td>${user.userPassword}</td>  
                        <td>${user.userBirthday}</td>  
                    </tr>  
                </c:forEach>  
            </c:when>  
            <c:otherwise>  
               <tr>  
                   <td colspan="2">无数据!</td>  
               </tr>  
            </c:otherwise>  
        </c:choose>  
</table>  
</body>  
</html>  