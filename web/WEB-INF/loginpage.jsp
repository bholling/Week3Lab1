<%-- 
    Document   : loginpage
    Created on : Sep 20, 2017, 2:20:42 PM
    Author     : 643699
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/WEB-INF/header.html" />
        
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="login" method="post">
                Username:<input type ="text" name="user" value="${user.username}"><br>
                Password:<input type="text" name="password" value="${user.password}"><br>
                <input type ="submit" value="Login">
            </form>
        </div>
        <br>
        ${message}
    
<c:import url="/WEB-INF/footer.html" />
