<%-- 
    Document   : showdvdcat
    Created on : Nov 22, 2020, 8:10:38 PM
    Author     : 61050151
--%>

<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.CatdvdTable"%>
<%@page import="model.CatdvdTable"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="model.Catdvd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="emp" class="model.Catdvd" scope="request"/>
    <%
            EntityManager em = (EntityManager) session.getAttribute("entitymanager");
            Vector<Catdvd> empList = CatdvdTable.findAllCatdvd(em);
            Iterator<Catdvd> itr = empList.iterator();
     %>
    <body>
<center>
<h1>DVD Catalog</h1>
 <table border="1">
          <tr>
            <th>DVD Name</th>
            <th>Rate</th>
            <th>Years</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>AddCart</th>
            
          </tr>
          <%while(itr.hasNext()) {
          emp = itr.next();    
          %>
          <tr>
          <td> <%=emp.getNamedvd() %></td>
          <td> <%=emp.getRate() %></td>
          <td> <%=emp.getYears() %></td>
          <td> <%=emp.getPrice() %></td>
          <form name ="addDVD" action="addtocartcontroller" method="POST">
              <input type="hidden" name ="nameDVD" value="<%=emp.getNamedvd() %>">
              <input type="hidden" name ="rateDVD" value="<%=emp.getRate() %>">
              <input type="hidden" name ="yearDVD" value="<%=emp.getYears() %>">
              <input type="hidden" name ="priceDVD" value="<%=emp.getPrice() %>">
              <td><input type='number' name='Qty' value='' size='7'/></td> 
              <td><input type='submit' name='submit' value='AddToCart' /></td>       
          </form>
          <tr>
          <%}%>
          
 </table>      
    <a href="menu.jsp">Back to Menu</a>
 </center>
       
    </body>
</html>
