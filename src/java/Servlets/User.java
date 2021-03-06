/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.Serializable;

/**
 *
 * @author Titan
 */
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    
    public User(){
        firstName ="";
        lastName ="";
        phone ="";
        address ="";
        city ="";
        state ="";
        zipCode ="";
        email ="";
    }
    
    public User(String firstName, String lastName, String phone, String address, String city, String state, String zipCode, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
   
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
   
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
   
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
   
    public String getZipCode(){
        return zipCode;
    }   
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
   
    public String getEmail(){
        return email;
    }  
    public void setEmail(String email){
        this.email = email;
    }
}
