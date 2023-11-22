<%-- 
    Document   : forinc
    Created on : 22 Nov, 2023, 8:30:25 PM
    Author     : gdhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!String username,password;%>
        <%
            username = request.getParameter("username");
            password = request.getParameter("pswd");
            if(username.equals("dansu")&&password.equals("1509")) {
        %>
        <jsp:forward page="forward.jsp"/>
        <%}else{%>
        <p>Username and Password are Incorrect</p>
        <jsp:include page="forinc.html"/>
        <%}%>
    </body>
</html>
