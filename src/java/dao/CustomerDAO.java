/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDBMySQL;
import java.sql.Connection;
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
}
