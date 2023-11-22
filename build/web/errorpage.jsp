<%-- 
    Document   : errorpage
    Created on : 22 Nov, 2023, 9:17:51 PM
    Author     : gdhan
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Sorry Exception Occured!</h1>
        <p>The exception is <%=exception%></p>
    </body>
</html>
