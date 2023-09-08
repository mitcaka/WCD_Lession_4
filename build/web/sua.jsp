<%-- 
    Document   : sua
    Created on : Sep 8, 2023, 7:54:33 PM
    Author     : ADMIN
--%>

<%@page import="model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sua thong tin khach hang</h1>
        <form action="ConfirmEditCustomer" name="txtId" method="get">
            <% Customer cus = (Customer) request.getAttribute("cus"); %>
            <input type="hidden" name="txtId" value="<%=cus.getId()%>">
            <br/> Tên : <input type="text" name="txtName" placeholder="Nhập tên" value="<%=cus.getCusName()%>"> <br/> <br/>            
            <br/> Email : <input type="text" name="txtEmail" placeholder="Nhập email" value="<%=cus.getEmail()%>"> <br/> <br/>            
            <br/> Phone : <input type="text" name="txtPhone" placeholder="Nhập số điện thoại" value="<%=cus.getPhone()%>"> <br/> <br/>
            <br/> Address : <input type="text" name="txtAddress" placeholder="Nhập địa chỉ" value="<%=cus.getAddress()%>"> <br/> <br/>
            <input type="submit" value="OK">
        </form> 
    </body>
</html>
