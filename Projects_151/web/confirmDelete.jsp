<%-- 
    Document   : confirmDelete
    Created on : Nov 25, 2020, 9:04:21 PM
    Author     : 61050151
--%>

<%@page import="model.Dvdcart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            Dvdcart emp = (Dvdcart) session.getAttribute("dvdcart");
            
        %>
        <form name="confirmDelete" action="CocfirmDeleteController">
            DVD Names: <%= emp.getCnamedvd() %> </br>
            Rate: <%= emp.getCrate() %> </br>
            Year: <%= emp.getCyears() %> </br>
            Price: <%= emp.getCprice() %> </br>
            Qty: <%= emp.getCqty() %> </br>
            <input type="submit" value="Delete" name="delete" />
            <input type="submit" value="Cancel" name="cancel" />
            
        </form>
    </body>
</html>
