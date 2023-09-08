/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDBMySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author ADMIN
 */
public class CustomerDAO {
    ConnectDBMySQL connectDB = new ConnectDBMySQL();
    public List<Customer> getListCustomer (){
        Connection conn = connectDB.getConnection__();
        List<Customer> ls = new ArrayList<Customer>();
        Statement st;
        try {
            st = conn.createStatement();
            String query = "select * from customer";
            ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            Customer e = new Customer(rs.getInt("ID"), rs.getString("cusName"), rs.getString("email"), rs.getString("phone"), rs.getString("address"));
            ls.add(e);
        }
        return ls;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertCustomer(Customer e) {
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            String sql = "INSERT INTO customer(cusName,email,phone,address) "
            + "VALUES(?,?,?,?)";
            
            PreparedStatement pstmt = connection.prepareStatement(sql,
                              Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, e.getCusName());
            pstmt.setString(2, e.getEmail());
            pstmt.setString(3, e.getPhone());
            pstmt.setString(4, e.getAddress());
        int rowAffected = pstmt.executeUpdate();
        if(rowAffected == 1)
        {
           return true;
        }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Customer getCustomerById(int id){
        Connection conn = connectDB.getConnection__();
        Customer cus = new Customer();
        Statement st;
        try {
            st = conn.createStatement();
            String query = "select * from customer where id = " + id;
            ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            cus.setId(id);
            cus.setCusName(rs.getString("cusName"));
            cus.setEmail(rs.getString("email"));
            cus.setAddress(rs.getString("address"));
            cus.setPhone(rs.getString("phone"));
        }
        return cus;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean UpdateCustomerById(Customer cus){
        Connection conn = connectDB.getConnection__();
        Statement st;
        try {
             String sqlUpdate = "UPDATE customer "
                + "SET cusName = ? , email = ? , phone = ?, address = ?"
                + "WHERE id = ?";
             PreparedStatement pr = conn.prepareStatement(sqlUpdate,
                              Statement.RETURN_GENERATED_KEYS);
             pr.setString(1,cus.getCusName());             
             pr.setString(2,cus.getEmail());
             pr.setString(3,cus.getPhone());
             pr.setString(4,cus.getAddress());
             pr.setInt(5,cus.getId());
            int rowAffected = pr.executeUpdate();
        if(rowAffected == 1)
        {
           return true;
        }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteCustomerById(int id) {
        Connection conn = connectDB.getConnection__();
        Statement st;
        try {
            st = conn.createStatement();
            String query = "delete from customer where id = " + id;
        int rowAffected = st.executeUpdate(query);
        if(rowAffected == 1)
        {
           return true;
        }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
