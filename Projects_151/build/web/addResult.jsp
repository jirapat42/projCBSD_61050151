<%-- 
    Document   : addResult
    Created on : Nov 25, 2020, 8:35:25 PM
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
       <h1><%=request.getAttribute("rowInserted") + " DVD is Add TO Your Cart " %> </h1>
        </br>
        <jsp:include page="showdvdcat.jsp" flush="true" />
    </body>
</html>
