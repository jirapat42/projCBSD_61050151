<%-- 
    Document   : showcart
    Created on : Nov 25, 2020, 8:47:28 PM
    Author     : 61050151
--%>

<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.DvdcartTable"%>
<%@page import="model.Dvdcart"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="emp" class="model.Dvdcart" scope="request"/>
    <%
            EntityManager em = (EntityManager) session.getAttribute("entitymanager");
            Vector<Dvdcart> empList = DvdcartTable.findAllCatdvd(em);
            Iterator<Dvdcart> itr = empList.iterator();
     %>
    <body>
        <center>
<h1>Shopping Cart</h1>
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
          <td> <%=emp.getCnamedvd()%></td>
          <td> <%=emp.getCrate() %></td>
          <td> <%=emp.getCyears() %></td>
          <td> <%=emp.getCprice() %></td>
          <td> <%=emp.getCqty()%></td>
          <form name ="addDVD" action="removedvdcartcontroller" method="POST">
              <input type="hidden" name="Dvdname" value="<%=emp.getCnamedvd() %>">
              <td><input type='submit' name='submit' value='remove' /></td>  
          </form>
          <tr>
          <%}%>
          
 </table>
 <a href="menu.jsp">Back to Menu</a>
 <form name ="checkoutDVD" action="cartcheckout" method="POST">
     <input type="hidden" name="Dvdname" value="<%=emp.getCnamedvd() %>">
     <input type="submit" name="submit" value="Checkout">
 </form>

 </center>
       
    </body>
</html>
