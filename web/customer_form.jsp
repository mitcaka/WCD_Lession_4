<%-- 
    Document   : customer_form
    Created on : Sep 6, 2023, 7:52:28 PM
    Author     : ADMIN
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Student Form</title>
    </head>
    <body>
        <h1>Form nhập thông tin</h1>
        <form action="InsertCustomer" method="get">
            <br/> Tên : <input type="text" name="txtName" placeholder="Nhập tên"> <br/> <br/>            
            <br/> Email : <input type="text" name="txtEmail" placeholder="Nhập email"> <br/> <br/>            
            <br/> Phone : <input type="text" name="txtPhone" placeholder="Nhập số điện thoại"> <br/> <br/>
            <br/> Address : <input type="text" name="txtAddress" placeholder="Nhập địa chỉ"> <br/> <br/>
            <input type="submit" value="OK">
        </form> 
    
    </body>
</html>

