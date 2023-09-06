<%-- 
    Document   : customer.jsp
    Created on : Sep 6, 2023, 7:00:08 PM
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    
        <h1>List Customer</h1>
        <% List<Customer> ls = (List<Customer>)request.getAttribute("lstCus"); %>
        <table style="border: 1px solid blue">
            <th>
                <td>ID</td>               
                <td>Customer Name</td>
                <td>Email</td>
                <td>Phone</td>
            </th>  
            <% for(Customer n : ls) { %>
            <tr>
                <td><%=n.getId()%></td>                
                <td><%=n.getCusName()%></td>
                <td><%=n.getEmail()%></td>
                <td><%=n.getPhone()%></td>                
                <td><%=n.getAddress()%></td>


            </tr>
            <% } %>
        </table>
