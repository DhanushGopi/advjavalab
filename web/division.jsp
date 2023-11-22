<%-- 
    Document   : division
    Created on : 22 Nov, 2023, 9:03:06 PM
    Author     : gdhan
--%>

<%@page errorPage="errorpage.jsp" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Division</title>
    </head>
    <body>
         <%!int no1,no2,div;%>
         <%
             no1 = Integer.parseInt(request.getParameter("no1"));
             no2 = Integer.parseInt(request.getParameter("no2"));
             div = no1/no2;
         %>
         First Number = <%=no1%><br>
         Second Number = <%=no2%><br>
         Quotient = <%=div%><br>
    </body>
</html>
