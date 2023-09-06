/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Customer {
    private int id;
    private String cusName;    
    private String email;
    private String phone;
    private String address;

    public Customer(int id, String cusName, String email, String phone, String address) {
        this.id = id;
        this.cusName = cusName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getCusName() {
        return cusName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

}
