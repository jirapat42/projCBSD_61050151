<%-- 
    Document   : deleteResult
    Created on : Nov 25, 2020, 9:30:27 PM
    Author     : 61050151
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <<h1><%= request.getAttribute("rowDeleted") + " DVD deleted " %> </h1>
        </br>
        <jsp:include page="showcart.jsp" flush="true" />
    </body>
</html>
