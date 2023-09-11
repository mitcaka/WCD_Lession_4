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
        <style>
            table, th, td {
                border: 1px solid;
                padding: 5px;
              }
              
              a:link, a:visited {
                background-color: #f44336;
                color: white;
                padding: 10px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                margin-right: 20px;
              }

              a:hover, a:active {
                background-color: red;
              }
        </style>
    </head>
    
        <h1>List Customer</h1>
        <% List<Customer> ls = (List<Customer>)request.getAttribute("lstCus"); %>
        <a href="customer_form.jsp">Thêm mới</a>
        <table>
            <tr style="font-weight: bold">
                <td>ID</td>               
                <td>Customer Name</td>
                <td>Email</td>
                <td>Phone</td>               
                <td>Address</td>
                <td>Action</td>
            </tr>  
            <% for(Customer n : ls) { %>
            <tr>
                <td><%=n.getId()%></td>                
                <td><%=n.getCusName()%></td>
                <td><%=n.getEmail()%></td>
                <td><%=n.getPhone()%></td>                
                <td><%=n.getAddress()%></td>
                <!--tạo url truyền id đến servlet--> 
                <td><a href="EditCustomer?id=<%=n.getId()%>">Sửa</a><a href="DeleteCustomer?id=<%=n.getId()%>">Xóa</a></td> 
            </tr>
            <% } %>
        </table>