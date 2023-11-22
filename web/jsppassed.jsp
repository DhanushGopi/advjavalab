<%-- 
    Document   : jsppassed
    Created on : 22 Nov, 2023, 2:46:32 PM
    Author     : gdhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP passed</title>
    </head>
    <body>
        <%!String name, roll;%>
        <%!int tamil, english, maths, science, social, total;%>
        <%name = request.getParameter("name");%>
        <p>Student name: <%=name%></p>
        <% roll = request.getParameter("rollno");%>
        <p>Roll Number: <%=roll%></p>
        <%tamil = Integer.parseInt(request.getParameter("tamilmark"));%>
        <%english = Integer.parseInt(request.getParameter("englishmark"));%>
        <%maths = Integer.parseInt(request.getParameter("mathsmark"));%>
        <%science = Integer.parseInt(request.getParameter("sciencemark"));%>
        <%social = Integer.parseInt(request.getParameter("socialmark"));%>
        <%total = tamil+english+maths+science+social;%>
        <p>Total Marks : <%=total%></p>
        <p>Average : <%=total/5%></p>
        <% if ((tamil>=40)&&(english>=40)&&(maths>=40)&&(science>=40)&&(social>=40)){%>
        <p>Your Passed the SSLC</p>
        <%}else{%>
        <p>Better luck next time!</p>
        <%}%>
    </body>
</html>
