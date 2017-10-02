<%-- 
    Document   : loginpage
    Created on : Sep 20, 2017, 2:20:42 PM
    Author     : 643699
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:import url="/WEB-INF/header.html" />
        
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="login" method="post">
                Username:<input type ="text" name="user" value="${username}"><br>
                Password:<input type="text" name="password" value="${password}"><br>
                <input type ="submit" value="Login">
            </form>
        </div>
        ${message}
    </body>
<c:import url="/WEB-INF/footer.html" />
