/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ConnectDBMySQL {
    public void getConnect(){   
        try{
            String url = "jdbc://localhost:3306/mydb";
            String user = "root";
            String pass = "";
            String DriveString = "com.mysql.jdbc.Driver";
            Class.forName(DriveString);
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement st = connection.createStatement();
            String query = "select * from customer";
            ResultSet rs = st.executeQuery(query);
            
        }catch(ClassNotFoundException ex){
            System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDBMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection__ (){
        Connection connection = null;
        try{
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String pass = "";
            String DriveString = "com.mysql.cj.jdbc.Driver";            
            String DriveString1 = "com.mysql.jdbc.Driver";

            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection(url, user, pass);
            
            if(connection!=null){
                System.out.println("Ket noi thanh cong");
            }else{
                System.out.println("Ket noi that bai");
            }
        }catch(ClassNotFoundException ex){
            System.out.println("Error khong ket noi dc db");
        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDBMySQL.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("khong ket noi dc db");
        }
        return connection;
}
    }
